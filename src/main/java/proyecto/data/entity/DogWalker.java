package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "dogwalker")
public class DogWalker implements Serializable {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 45)
    private String name;
    @Column(nullable = false, length = 45)
    private String surname;
    @Column(nullable = false, length = 150)
    private String email;
    @Column(nullable = false, length = 15)
    private String phone;
    @Column(nullable = false, length = 200)
    private String availability;
    @Column(nullable = false, length = 150)
    private String address;
    @Column(nullable = false)
    private Integer max_num_dogs;
    @Column(nullable = false)
    private boolean sterilized;
    @Column(length = 400)
    private String reviews;
    private float ranking;
    @Column(nullable = false)
    private float price_walk;
    private String profile_picture;
    private String gallery;
    //Relations
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "dogwalkers")
    private Set<User> users;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Address> addresses;

    @OneToMany(mappedBy = "dogWalkers")
    private Set<Catalogue> catalogue;

    // Constructor
    public DogWalker() {
    }

    public DogWalker(Integer id, String name, String surname, String email, String phone, String availability,
                     String address, Integer max_num_dogs, boolean sterilized, String reviews,
                     float ranking, float price_walk, String profile_picture, String gallery) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.availability = availability;
        this.address = address;
        this.max_num_dogs = max_num_dogs;
        this.sterilized = sterilized;
        this.reviews = reviews;
        this.ranking = ranking;
        this.price_walk = price_walk;
        this.profile_picture = profile_picture;
        this.gallery = gallery;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMax_num_dogs() {
        return max_num_dogs;
    }

    public void setMax_num_dogs(Integer max_num_dogs) {
        this.max_num_dogs = max_num_dogs;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public float getRanking() {
        return ranking;
    }

    public void setRanking(float ranking) {
        this.ranking = ranking;
    }

    public float getPrice_walk() {
        return price_walk;
    }

    public void setPrice_walk(float price_walk) {
        this.price_walk = price_walk;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Catalogue> getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Set<Catalogue> catalogue) {
        this.catalogue = catalogue;
    }
}