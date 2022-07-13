package proyecto.dto;


public class DaycareDTO {
    private String name;
    private String reservation;
    private Integer id;
    private float night_price;
    private String phone;
    private String email;
    private String address;
    private float assessment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getNight_price() {
        return night_price;
    }

    public void setNight_price(float night_price) {
        this.night_price = night_price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getAssessment() {
        return assessment;
    }

    public void setAssessment(float assessment) {
        this.assessment = assessment;
    }
}
