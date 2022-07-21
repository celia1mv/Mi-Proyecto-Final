package proyecto.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "paymentMethod")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;

    //Relaciones
    @ManyToOne()
    @JoinColumn(name="user_id")
    private User user;

    //Constructores

    public PaymentMethod() {
    }

    public PaymentMethod(Integer id, String description, User user) {
        this.id = id;
        this.description = description;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
