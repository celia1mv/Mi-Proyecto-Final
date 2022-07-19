package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "USERS")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_initial")
    private Date date;
    @Basic(optional = false)
    private boolean active;
    @Column(nullable = true, length = 45)
    private String name;
    @Column(name = "surname", nullable = true, length = 45)
    private String Surname;
    @Column(nullable = true, length = 150)
    private String email;
    @Column(nullable = true, length = 15)
    private String phone;
    @Column(name = "birth_date", nullable = true)
    private Date birthDate;

    //Relations
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "user_role",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    Set<RoleEntity> role;
    @ManyToOne()
    @JoinColumn(name="dog_id")
    private DogEntity dog;

    @OneToOne()
    @JoinColumn(name="dogWalker_id")
    private DogWalkerEntity dogWalker;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Set<RoleEntity> getRole() {
        return role;
    }

    public void setRole(Set<RoleEntity> role) {
        this.role = role;
    }

    public DogEntity getDog() {
        return dog;
    }

    public void setDog(DogEntity dog) {
        this.dog = dog;
    }
}