package proyecto.dto;

import java.util.Date;

public class InvoiceDTO {
    private Integer id;
    private Date invoiceDate;
    private float amount;
    private String status;
    private Integer servicesUsersId;
    private Integer paymentMethodsId;

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

    public Integer getServicesUsersId() {
        return servicesUsersId;
    }

    public void setServicesUsersId(Integer servicesUsersId) {
        this.servicesUsersId = servicesUsersId;
    }

    public Integer getPaymentMethodsId() {
        return paymentMethodsId;
    }

    public void setPaymentMethodsId(Integer paymentMethodsId) {
        this.paymentMethodsId = paymentMethodsId;
    }
}
