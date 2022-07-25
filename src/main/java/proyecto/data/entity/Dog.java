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
@Table(name = "dog")
public class Dog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "weight_kg")
    private Integer weight;
    private Integer age;
    @Column(nullable = false)
    private String gender;
    private Integer microchip;
    private String race;
    private String sterilized;
    private String allergies;
    private boolean compatible; // Este atributo identifica si el perro puede pasear con otros perros (true) o si tiene que pasear solo (false)
    @Column(name = "inf_additional")
    private String informationAdditional;



    @OneToMany(mappedBy = "dog")
    private Set<User> user;

    public Dog() {  }

    public Dog(Long id, String name, Integer weight, Integer age, String gender, Integer microchip,
               String race, String sterilized, String allergies, boolean compatible,
               String informationAdditional, Set<User> user) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.microchip = microchip;
        this.race = race;
        this.sterilized = sterilized;
        this.allergies = allergies;
        this.compatible = compatible;
        this.informationAdditional = informationAdditional;
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

    public boolean isCompatible() {
        return compatible;
    }

    public void setCompatible(boolean compatible) {
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