package proyecto.data.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DOG")
public class Dog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer age;
    private String allergies;
    private Integer compatible;
    @Column(nullable = false)
    private String gender;
    @Column(name = "inf_additional")
    private String informationAdditional;
    private Integer microchip;
    private String name;
    private String race;
    private String sterilized;
    @Column(name = "weight_kg")
    private Integer weight;

    @OneToMany(mappedBy = "dog")
    private Set<User> user;

    public Dog() {  }

    public Dog(Long id, Integer age, String allergies, Integer compatible, String gender,
               String informationAdditional, Integer microchip, String name, String race, String sterilized,
               Integer weight, Set<User> user) {
        this.id = id;
        this.age = age;
        this.allergies = allergies;
        this.compatible = compatible;
        this.gender = gender;
        this.informationAdditional = informationAdditional;
        this.microchip = microchip;
        this.name = name;
        this.race = race;
        this.sterilized = sterilized;
        this.weight = weight;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public Integer getCompatible() {
        return compatible;
    }

    public void setCompatible(Integer compatible) {
        this.compatible = compatible;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInformationAdditional() {
        return informationAdditional;
    }

    public void setInformationAdditional(String informationAdditional) {
        this.informationAdditional = informationAdditional;
    }

    public Integer getMicrochip() {
        return microchip;
    }

    public void setMicrochip(Integer microchip) {
        this.microchip = microchip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSterilized() {
        return sterilized;
    }

    public void setSterilized(String sterilized) {
        this.sterilized = sterilized;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }
}