package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "dogWalker")
public class DogWalker implements Serializable {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String address;

    @Column(nullable = false, length = 200)
    private String availability;

    @Column(nullable = false)
    private Integer max_num_dogs;

    @Column(nullable = false, length = 45)
    private String weight_dogs;

    @Column(nullable = false)
    private boolean sterilized;

    @Column(length = 400)
    private String reviews;
    private float assessment;

    @Column(nullable = false)
    private float price_walk;
    private String profile_picture;
    private String gallery;

    //Relations
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "dogwalkers")
    private Set<User> users;

    @ManyToMany (fetch = FetchType.EAGER)
    private Set<Address> addresses;

    @OneToMany (mappedBy = "dogWalkers")
    private Set<Catalogue> catalogue;

    // Constructor
    public DogWalker() {
    }

    public DogWalker(Integer id, String address, String availability, Integer max_num_dogs,
                     String weight_dogs, boolean sterilized, String reviews, float assessment,
                     float price_walk, String profile_picture, String gallery, Set<DogWalker> dogWalkers,
                     Set<Address> addresses, Set<Catalogue> catalogue) {
        this.id = id;
        this.address = address;
        this.availability = availability;
        this.max_num_dogs = max_num_dogs;
        this.weight_dogs = weight_dogs;
        this.sterilized = sterilized;
        this.reviews = reviews;
        this.assessment = assessment;
        this.price_walk = price_walk;
        this.profile_picture = profile_picture;
        this.gallery = gallery;
        this.addresses = addresses;
        this.catalogue = catalogue;
    }


}