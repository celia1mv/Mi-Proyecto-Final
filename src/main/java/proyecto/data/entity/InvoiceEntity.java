package proyecto.data.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoice")
public class InvoiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date invoiceDate;
    @Column(nullable = false)
    private float amount;
    @Column(nullable = false, length = 45)
    private String status;

    // Relations
    @ManyToOne()
    @JoinColumn(name="user_id")
    private UserEntity user;

    //Constructor

    public InvoiceEntity() {
    }

    public InvoiceEntity(Integer id, Date invoiceDate, float amount, String status) {
        this.id = id;
        this.invoiceDate = invoiceDate;
        this.amount = amount;
        this.status = status;
    }
    //GetterSetter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
