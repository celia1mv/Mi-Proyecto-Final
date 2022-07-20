package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "address")
public class AddressEntity implements Serializable {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 45)
    private String country;
    @Column(nullable = false, length = 45)
    private String province;
    @Column(nullable = false, length = 45)
    private String city;
    @Column(nullable = false, length = 45)
    private String postalCode;
    @Column(nullable = false, length = 200)
    private String address;

    //Relations

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "addresses")
    private Set<UserEntity> users;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "addresses")
    private Set<DogWalkerEntity> dogWalkers;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "addresses")
    private Set<DaycareEntity> daycares;

    //Constructores

    public AddressEntity() {
    }

    public AddressEntity(Integer id, String country, String province, String city, String postalCode, String address,
                         Set<UserEntity> users, Set<DogWalkerEntity> dogWalkers, Set<DaycareEntity> daycares) {
        this.id = id;
        this.country = country;
        this.province = province;
        this.city = city;
        this.postalCode = postalCode;
        this.address = address;
        this.users = users;
        this.dogWalkers = dogWalkers;
        this.daycares = daycares;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }

    public Set<DogWalkerEntity> getDogWalkers() {
        return dogWalkers;
    }

    public void setDogWalkers(Set<DogWalkerEntity> dogWalkers) {
        this.dogWalkers = dogWalkers;
    }

    public Set<DaycareEntity> getDaycares() {
        return daycares;
    }

    public void setDaycares(Set<DaycareEntity> daycares) {
        this.daycares = daycares;
    }
}
