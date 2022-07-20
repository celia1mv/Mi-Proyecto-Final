package proyecto.data.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "CATALOGUE")
public class CatalogueEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 45)
    private String serviceType;

    //Relaciones

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private DaycareEntity daycares;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private DogWalkerEntity dogWalkers;


    //Constructores


    public CatalogueEntity() {
    }

    public CatalogueEntity(Integer id, String serviceType, DaycareEntity daycares, DogWalkerEntity dogWalkers) {
        this.id = id;
        this.serviceType = serviceType;
        this.daycares = daycares;
        this.dogWalkers = dogWalkers;
    }
    //Getter y Setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public DaycareEntity getDaycares() {
        return daycares;
    }

    public void setDaycares(DaycareEntity daycares) {
        this.daycares = daycares;
    }

    public DogWalkerEntity getDogWalkers() {
        return dogWalkers;
    }

    public void setDogWalkers(DogWalkerEntity dogWalkers) {
        this.dogWalkers = dogWalkers;
    }
}
