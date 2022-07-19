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

    public PaymentMethodEntity(Integer id, String description) {
        this.id = id;
        this.description = description;
    }
    //Getter setter

}
