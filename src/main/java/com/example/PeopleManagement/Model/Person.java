package com.example.PeopleManagement.Model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name= "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column(name = "name")
    public String name;
    @Column(name = "location_type")
    public String location_type;
    @Column(name = "city")
    public String city;
    @Column(name = "zip_code")
    public String zip_code;
    @Column(name = "birth_date")
    public Date birth_date;
    @Column(name = "number")
    public int number;

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

    public String getLocationType() {
        return location_type;
    }

    public void setLocationType(String locationType) {
        this.location_type = locationType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zip_code;
    }

    public void setZipCode(String zipCode) {
        this.zip_code = zipCode;
    }

    public Date getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(Date birthDate) {
        this.birth_date = birthDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}