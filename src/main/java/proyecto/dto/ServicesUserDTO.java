package proyecto.dto;

import java.util.Date;

public class ServicesUserDTO {
    private Integer id;
    private String username;
    private String bookingStatus;
    private Date creationDate;
    private String serviceName;
    private Date bookingStartDate;
    private Date bookingLastDate;
    private Integer userId;
    private Integer cataloguesId;
    private Integer dogsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Date getBookingStartDate() {
        return bookingStartDate;
    }

    public void setBookingStartDate(Date bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    public Date getBookingLastDate() {
        return bookingLastDate;
    }

    public void setBookingLastDate(Date bookingLastDate) {
        this.bookingLastDate = bookingLastDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCataloguesId() {
        return cataloguesId;
    }

    public void setCataloguesId(Integer cataloguesId) {
        this.cataloguesId = cataloguesId;
    }

    public Integer getDogsId() {
        return dogsId;
    }

    public void setDogsId(Integer dogsId) {
        this.dogsId = dogsId;
    }
}
