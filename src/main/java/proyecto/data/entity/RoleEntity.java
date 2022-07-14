package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "ROLE")
public class RoleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_name", nullable = false)
    private String roleName;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "role")
    private Set<UserEntity> user;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "role")
    private Set<MenuEntity> menu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<UserEntity> getUsers() {
        return user;
    }

    public void setUsers(Set<UserEntity> userEntities) {
        this.user = userEntities;
    }

    public Set<MenuEntity> getMenus() {
        return menu;
    }

    public void setMenus(Set<MenuEntity> menuEntities) {
        this.menu = menuEntities;
    }
}
