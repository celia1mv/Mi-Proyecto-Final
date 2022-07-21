package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "USERS")
public class User implements Serializable {

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
    Set<Role> role;


    @ManyToMany(fetch = FetchType.EAGER)
    private Set<DogWalker> dogwalkers;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Address> addresses;

    @ManyToOne()
    @JoinColumn(name="dog_id")
    private Dog dog;

    @OneToMany(mappedBy = "user")
    private Set<PaymentMethod> paymentMethodes;

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

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<DogWalker> getDogwalkers() {
        return dogwalkers;
    }

    public void setDogwalkers(Set<DogWalker> dogwalkers) {
        this.dogwalkers = dogwalkers;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Set<PaymentMethod> getPaymentMethodes() {
        return paymentMethodes;
    }

    public void setPaymentMethodes(Set<PaymentMethod> paymentMethodes) {
        this.paymentMethodes = paymentMethodes;
    }
}