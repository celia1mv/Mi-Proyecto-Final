package proyecto.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "paymentMethod")
public class PaymentMethodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;

    //Relaciones

    //Constructores

    public PaymentMethodEntity() {
    }

    public PaymentMethodEntity(Integer id, String description) {
        this.id = id;
        this.description = description;
    }
    //Getter setter

}
