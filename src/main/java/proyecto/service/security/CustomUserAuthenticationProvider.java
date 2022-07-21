package proyecto.service.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import proyecto.data.entity.Role;
import proyecto.data.entity.User;
import proyecto.data.repository.UserRepository;

import java.util.Collection;

@Component
public class CustomUserAuthenticationProvider implements AuthenticationProvider {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public CustomUserAuthenticationProvider(UserRepository userRepository,
                                            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;

        final User user = token.getName() == null ? null : userRepository.findByUserNameAndActiveTrue(token.getName());
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username/password");
        }
        passwordEncoder.encode(user.getPassword());
        if (!passwordEncoder.matches(token.getCredentials().toString(), user.getPassword())) {
            throw new BadCredentialsException("Invalid username/password");
        }

        return new UsernamePasswordAuthenticationToken(user, user.getPassword(), this.createAuthorities(user));
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.equals(authentication);
    }

    private Collection<? extends GrantedAuthority> createAuthorities(User user) {
        return AuthorityUtils.createAuthorityList(user.getRole().stream()
                .map(Role::getRoleName)
                .toArray(String[]::new)
        );
    }
}