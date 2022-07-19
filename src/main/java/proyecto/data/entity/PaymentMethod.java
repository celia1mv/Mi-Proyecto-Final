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

    //Constructores

    public PaymentMethod() {
    }

    public PaymentMethod(Integer id, String description) {
        this.id = id;
        this.description = description;
    }
    //Getter setter

}
