package proyecto.service.mapper;

import org.springframework.stereotype.Service;
import proyecto.data.entity.Role;
import proyecto.dto.RoleDTO;

@Service
public class RoleServiceMapper extends AbstractServiceMapper<Role, RoleDTO> {

    public Role toEntity(RoleDTO dto) {
        final Role entity = new Role();
        entity.setId(dto.getId());
        entity.setRoleName(dto.getRoleName());
        return entity;
    }

    public RoleDTO toDto(Role entity) {
        final RoleDTO dto = new RoleDTO();
        dto.setId(entity.getId());
        dto.setRoleName(entity.getRoleName());
        return dto;
    }
}
