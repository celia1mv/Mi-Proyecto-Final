package proyecto.data.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "servicesUser")
public class ServicesRoleEntity {
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

    //Relaciones
    //Constructor


    public ServicesRoleEntity() {
    }

    public ServicesRoleEntity(Integer id, String username, String bookingStatus, Date creationDate,
                              String serviceName, Date bookingStartDate, Date bookingLastDate) {
        this.id = id;
        this.username = username;
        this.bookingStatus = bookingStatus;
        this.creationDate = creationDate;
        this.serviceName = serviceName;
        this.bookingStartDate = bookingStartDate;
        this.bookingLastDate = bookingLastDate;
    }

    //Getter Setter
}
