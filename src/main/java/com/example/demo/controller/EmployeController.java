package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee.Employe;
import com.example.demo.Model.Employee.EmployeDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class EmployeController {
    
    @Autowired
    private EmployeDAO employeDAO;
    @GetMapping("/etax/test")
    public List<Employe> getteList(){
        List<Employe> list= new ArrayList<>()  ;
        list.add(new Employe(1,"fayssal","fayssal@lalfa.com",".656367698"));
        return  list;
    }

    @GetMapping("/Employe/getAllEmploye")
    public List<Employe> getAllEmploye() {
        return employeDAO.findAll();
    }
    
}
