package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "dogWalker")
public class DogWalkerEntity implements Serializable {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String address;

    @Column(nullable = false, length = 200)
    private String availability;

    @Column(nullable = false)
    private Integer max_num_dogs;

    @Column(nullable = false, length = 45)
    private String weight_dogs;

    @Column(nullable = false)
    private boolean sterilized;

    @Column(length = 400)
    private String reviews;
    private float assessment;

    @Column(nullable = false)
    private float price_walk;
    private String profile_picture;
    private String gallery;

    //Relations
    //Un usuario puede contratar a un paseador, y un paseador puede ser contratado por varios
    @ManyToMany (fetch = FetchType.EAGER)
    private Set<UserEntity> user;

    // Constructor
    public DogWalkerEntity() {
    }

    public DogWalkerEntity(Integer id, String address, String availability, Integer max_num_dogs,
                           String weight_dogs, boolean sterilized, String reviews, float assessment,
                           float price_walk, String profile_picture, String gallery, Set<UserEntity> user) {
        this.id = id;
        this.address = address;
        this.availability = availability;
        this.max_num_dogs = max_num_dogs;
        this.weight_dogs = weight_dogs;
        this.sterilized = sterilized;
        this.reviews = reviews;
        this.assessment = assessment;
        this.price_walk = price_walk;
        this.profile_picture = profile_picture;
        this.gallery = gallery;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
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

    public Set<UserEntity> getUser() {
        return user;
    }

    public void setUser(Set<UserEntity> user) {
        this.user = user;
    }
}