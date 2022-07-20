package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

    @Entity
    @Table(name = "daycare")
    public class DaycareEntity implements Serializable {
        //Attributes
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        @Column(nullable = false, length = 45)
        private String name;

        @Column(name = "night_price", nullable = false)
        private float nightPrice;

        @Column(nullable = false, length = 15)
        private String phone;
        @Column(nullable = false, length = 150)
        private String email;
        @Column(nullable = false, length = 150)
        private String address;
        @Column(nullable = false)
        private float ranking;
        // Relations

        @ManyToMany(fetch = FetchType.EAGER)
        private Set<AddressEntity> addresses;

        @OneToMany(mappedBy = "daycares")
        private Set<CatalogueEntity> catalogue;


        // Constructor
        public DaycareEntity() {
        }
        public DaycareEntity(Integer id, String name, float nightPrice, String phone, String email, String address,
                             float ranking, Set<AddressEntity> addresses, Set<CatalogueEntity> catalogue) {
            this.id = id;
            this.name = name;
            this.nightPrice = nightPrice;
            this.phone = phone;
            this.email = email;
            this.address = address;
            this.ranking = ranking;
            this.addresses = addresses;
            this.catalogue = catalogue;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getNightPrice() {
            return nightPrice;
        }

        public void setNightPrice(float nightPrice) {
            this.nightPrice = nightPrice;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public float getRanking() {
            return ranking;
        }

        public void setRanking(float ranking) {
            this.ranking = ranking;
        }

        public Set<AddressEntity> getAddresses() {
            return addresses;
        }

        public void setAddresses(Set<AddressEntity> addresses) {
            this.addresses = addresses;
        }

        public Set<CatalogueEntity> getCatalogue() {
            return catalogue;
        }

        public void setCatalogue(Set<CatalogueEntity> catalogue) {
            this.catalogue = catalogue;
        }
    }