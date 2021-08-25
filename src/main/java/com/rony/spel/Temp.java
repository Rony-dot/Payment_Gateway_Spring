package com.rony.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
//@Scope("prototype")
public class Temp {

    @Value("001")
    private long id;

    @Value("value name")
    private String firstName;

    @Value("#{new java.lang.String('value last name')}")
    private String lastName;

    @Value("#{ 1 > 2 ? 1 : 2 }")
    private int x;

    @Value("#{2+2+2+2}")
    private int y;

    @Value("#{ T(java.lang.Math).sqrt(144) }")
    private double z;

    @Value("#{ T(java.lang.Math).PI }")
    private double p;


    @Value("#{list1}")
    private List<String> address;

    @Value("#{ new java.util.ArrayList({'1','2'}) }")
    private List<String> phoneNo;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public List<String> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<String> phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", p=" + p +
                ", address=" + address +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
