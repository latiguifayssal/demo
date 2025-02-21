package com.example.demo.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface  EmployerRepositry extends CrudRepository<Employe, Integer> {

}
