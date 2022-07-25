package proyecto.data.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "catalogue")
public class Catalogue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 45)
    private String serviceType;

    //Relaciones

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Daycare daycares;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private DogWalker dogWalker;


    //Constructores


    public Catalogue() {
    }

    public Catalogue(Integer id, String serviceType, Daycare daycares, DogWalker dogWalker) {
        this.id = id;
        this.serviceType = serviceType;
        this.daycares = daycares;
        this.dogWalker = dogWalker;
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

    public Daycare getDaycares() {
        return daycares;
    }

    public void setDaycares(Daycare daycares) {
        this.daycares = daycares;
    }

    public DogWalker getDogWalker() {
        return dogWalker;
    }

    public void setDogWalker(DogWalker dogWalker) {
        this.dogWalker = dogWalker;
    }
}
