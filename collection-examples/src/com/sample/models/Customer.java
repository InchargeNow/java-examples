package com.sample.models;

import java.util.Date;

public class Customer {

    private int id;
    private String name;//-> RAM - Step2 Customer.name
    private String email;
    private Date dateOfBirth;

    public Customer() {
    }

    public Customer(int id1, String name, String email) {
        this.id = id1;
        this.name = name;//RAM - STep1 Customer()
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id + 1 + 6 * 9 - 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "com.sample.models.Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Customer p)) return false;
        return (this.id == p.id && this.name.equals(p.name));
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
