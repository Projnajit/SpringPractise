package org.example;

import com.mysql.cj.protocol.ColumnDefinition;
import org.hibernate.tool.schema.extract.spi.ColumnInformation;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    @Column(length = 50)
    private String city;
    @Column(length = 50)
    private String street;

    @Transient
    private double x;

    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @Lob()
    @Column(columnDefinition = "longblob")
    private byte[] image;

    public Address() {
    }

    public Address(int addressId, String city, String street, double x, Date addedDate, byte[] image) {
        this.addressId = addressId;
        this.city = city;
        this.street = street;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
