package proyecto.dto;

import proyecto.data.entity.User;

import java.util.Set;

public class AddressDTO {
    private Integer id;
    private String country;
    private String province;
    private String city;
    private String postalCode;
    private String address;
    private Set<User> users;
    private Set<DogWalkerDTO> dogWalkers;
    private Set<DaycareDTO> daycares;

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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<DogWalkerDTO> getDogWalkers() {
        return dogWalkers;
    }

    public void setDogWalkers(Set<DogWalkerDTO> dogWalkers) {
        this.dogWalkers = dogWalkers;
    }

    public Set<DaycareDTO> getDaycares() {
        return daycares;
    }

    public void setDaycares(Set<DaycareDTO> daycares) {
        this.daycares = daycares;
    }
}
