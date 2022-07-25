package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "dogwalker")
public class DogWalker implements Serializable {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 45)
    private String doc_identification;
    @Column(nullable = false, length = 45)
    private String name;
    @Column(nullable = false, length = 45)
    private String userName;
    @Column(nullable = false, length = 45)
    private String surname;
    @Column(nullable = false, length = 150)
    private String email;
    @Column(nullable = false, length = 512)
    private String password;
    @Column(nullable = false, length = 15)
    private String phone;
    @Column(nullable = false)
    private Date birthdate;
    @Column(nullable = false, length = 200)
    private String availability;
    @Column(nullable = false, length = 150)
    private String address;
    @Column(nullable = false)
    private Integer max_num_dogs;
    @Column(nullable = false, length = 45)
    private String weight_dogs;
    @Column(nullable = false, length = 10)
    private String sterilized;
    @Column(length = 400)
    private String reviews;
    private float assessment;
    @Column(nullable = false)
    private float price_walk;
    private String profile_picture;
    private String gallery;



    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "dogWalker")
    private Set<User> users;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Address> addresses;

    @OneToMany(mappedBy = "dogWalker")
    private Set<Catalogue> catalogue;


    public DogWalker() {
    }

    public DogWalker(Integer id, String doc_identification, String name, String userName, String surname, String email, String password, String phone, Date birthdate,
                     String availability, String address, Integer max_num_dogs, String weight_dogs, String sterilized,
                     String reviews, float assessment, float price_walk, String profile_picture, String gallery) {
        this.id = id;
        this.doc_identification = doc_identification;
        this.name = name;
        this.userName = userName;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.birthdate = birthdate;
        this.availability = availability;
        this.address = address;
        this.max_num_dogs = max_num_dogs;
        this.weight_dogs = weight_dogs;
        this.sterilized = sterilized;
        this.reviews = reviews;
        this.assessment = assessment;
        this.price_walk = price_walk;
        this.profile_picture = profile_picture;
        this.gallery = gallery;
    }

    // Getters and Setters

    public void setCatalogue(Set<Catalogue> catalogue) {
        this.catalogue = catalogue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoc_identification() {
        return doc_identification;
    }

    public void setDoc_identification(String doc_identification) {
        this.doc_identification = doc_identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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

    public String getWeight_dogs() {
        return weight_dogs;
    }

    public void setWeight_dogs(String weight_dogs) {
        this.weight_dogs = weight_dogs;
    }

    public String getSterilized() {
        return sterilized;
    }

    public void setSterilized(String sterilized) {
        this.sterilized = sterilized;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public float getAssessment() {
        return assessment;
    }

    public void setAssessment(float assessment) {
        this.assessment = assessment;
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

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Catalogue> getCatalogue() {
        return catalogue;
    }

}