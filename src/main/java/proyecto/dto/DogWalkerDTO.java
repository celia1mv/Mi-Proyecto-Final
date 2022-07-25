package proyecto.dto;

import java.util.Date;
import java.util.Set;

public class DogWalkerDTO {
    private Integer id;
    private String doc_identification;
    private String name;
    private String userName;
    private String surname;
    private String email;
    private String password;
    private String phone;
    private Date birthdate;
    private String availability;
    private String address;
    private Integer max_num_dogs;
    private String weight_dogs;
    private String sterilized;
    private String reviews;
    private float assessment;
    private float price_walk;
    private String profile_picture;
    private String gallery;
    private Set<AddressDTO> addresses;

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

    public Set<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressDTO> addresses) {
        this.addresses = addresses;
    }


}