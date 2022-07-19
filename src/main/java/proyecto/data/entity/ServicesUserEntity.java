package proyecto.data.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "servicesUser")
public class ServicesUserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 45)
    private String username;
    @Column(nullable = false, length = 100)
    private String bookingStatus;
    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date creationDate;
    @Column(nullable = false, length = 45)
    private String serviceName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date bookingStartDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date bookingLastDate;

    // Relations

    // Constructores

    public ServicesUserEntity() {
    }

    public ServicesUserEntity(Integer id, String username, String bookingStatus, Date creationDate,
                              String serviceName, Date bookingStartDate, Date bookingLastDate) {
        this.id = id;
        this.username = username;
        this.bookingStatus = bookingStatus;
        this.creationDate = creationDate;
        this.serviceName = serviceName;
        this.bookingStartDate = bookingStartDate;
        this.bookingLastDate = bookingLastDate;
    }
// Getter and Setters

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
}
