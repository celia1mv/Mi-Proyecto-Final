package proyecto.dto;

public class CatalogueDTO {
    private Integer id;
    private String serviceType;
    private Integer daycaresId;
    private Integer dogWalkersId;

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

    public Integer getDaycaresId() {
        return daycaresId;
    }

    public void setDaycaresId(Integer daycaresId) {
        this.daycaresId = daycaresId;
    }

    public Integer getDogWalkersId() {
        return dogWalkersId;
    }

    public void setDogWalkersId(Integer dogWalkersId) {
        this.dogWalkersId = dogWalkersId;
    }
}
