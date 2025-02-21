package com.example.demo.Model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class EmployeDAO  {

    @Autowired
    private EmployerRepositry employerRepositry;

    public void save(Employe employe) {
        employerRepositry.save(employe);
    }
    public void saveList(List<Employe> l)
    {
        employerRepositry.saveAll(l);
    }

    public List<Employe> findAll() {
        List<Employe> list = new ArrayList<>() ;
        Streamable.of(employerRepositry.findAll()).forEach(list::add);
        
        return list;}
    public void delete(Employe employe) {
        employerRepositry.delete(employe);
    }
}
