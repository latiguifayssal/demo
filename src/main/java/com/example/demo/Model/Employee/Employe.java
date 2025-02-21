package com.example.demo.Model.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String numtlf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNumtlf() {
        return numtlf;
    }

    public void setNumtlf(String numtlf) {
        this.numtlf = numtlf;
    }

    @Override
    public String toString() {
        return "Employe [id=" + id + ", name=" + name + ", email=" + email + ", numtlf=" + numtlf + "]";
    }

    
}
