package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "ROLE")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_name", nullable = false)
    private String roleName;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "role")
    private Set<User> user;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "role")
    private Set<Menu> menu;

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

    public Set<User> getUsers() {
        return user;
    }

    public void setUsers(Set<User> userEntities) {
        this.user = userEntities;
    }

    public Set<Menu> getMenus() {
        return menu;
    }

    public void setMenus(Set<Menu> menuEntities) {
        this.menu = menuEntities;
    }
}
