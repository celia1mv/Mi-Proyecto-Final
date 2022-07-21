package proyecto.data.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoice")
public class Invoice {

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

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ServicesUser servicesUsers;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private PaymentMethod paymentMethods;

    //Constructor

    public Invoice() {
    }

    public Invoice(Integer id, Date invoiceDate, float amount, String status,
                   ServicesUser servicesUsers, PaymentMethod paymentMethods) {
        this.id = id;
        this.invoiceDate = invoiceDate;
        this.amount = amount;
        this.status = status;
        this.servicesUsers = servicesUsers;
        this.paymentMethods = paymentMethods;
    }

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

    public ServicesUser getServicesUsers() {
        return servicesUsers;
    }

    public void setServicesUsers(ServicesUser servicesUsers) {
        this.servicesUsers = servicesUsers;
    }

    public PaymentMethod getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(PaymentMethod paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}
