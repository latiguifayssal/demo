package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee.Employe;
import com.example.demo.Model.Employee.EmployeDAO;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EmployeController {
    
    @Autowired
    private EmployeDAO employeDAO;

    @GetMapping("/Employe/getAllEmploye")
    public List<Employe> getAllEmploye() {
        return employeDAO.findAll();
    }
    
}
