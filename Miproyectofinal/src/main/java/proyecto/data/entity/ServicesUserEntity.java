package proyecto.data.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "servicesUser")
public class ServicesUserEntity  implements Serializable {

    // Attributes
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

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User users;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Catalogue catalogues;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private DogEntity dogs;

    // Constructores

    public ServicesUserEntity(Integer id, String username, String BookingStatus, Date CreationDate, String serviceName, Date bookingStartDate, Date bookingLastDate) {
        this.id = id;
        this.username = username;
        this.bookingStatus = BookingStatus;
        this.creationDate = CreationDate;
        this.serviceName = serviceName;
        this.bookingStartDate = bookingStartDate;
        this.bookingLastDate = bookingLastDate;
    }


    // Getter and Setters

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public Catalogue getCatalogues() {
        return catalogues;
    }

    public void setCatalogues(Catalogue catalogues) {
        this.catalogues = catalogues;
    }

    public DogEntity getDogs() {
        return dogs;
    }

    public void setDogs(DogEntity dogs) {
        this.dogs = dogs;
    }

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
