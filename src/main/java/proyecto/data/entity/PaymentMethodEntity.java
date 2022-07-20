package proyecto.data.entity;

import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table(name = "paymentMethod")
public class PaymentMethodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;

    //Relaciones
    @ManyToOne()
    @JoinColumn(name="user_id")
    private UserEntity user;

    //Constructores

    public PaymentMethodEntity() {
    }

    public PaymentMethodEntity(Integer id, String description, UserEntity user) {
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
