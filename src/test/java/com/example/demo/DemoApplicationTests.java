package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Model.Employee.Employe;
import com.example.demo.Model.Employee.EmployeDAO;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private EmployeDAO employeDAO;

	@Test
	void affiche() {
		System.out.println("hello");
	}

	// @Test
	void addEmploye() {
		Employe employe = new Employe();
		for (int i = 0; i < 10; i++) {
			employe.setName("fayssal latigui" + i);
			employe.setEmail("ggggg@gmail.com" + i);
			employe.setNumtlf("0656367698");
			employeDAO.save(employe);

		}

	}

	@Test
	void addListEmployes() {
		Employe employe = new Employe();
		List<Employe> list= new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			employe.setName("fayssal latigui" + i);
			employe.setEmail("ggggg@gmail.com"+i);
			employe.setNumtlf("0656367698");
			list.add(employe);

		}
		System.out.println("list size : "+list.size());
		employeDAO.saveList(list);

	}

	// @Test
	void findAllEmploye() {
		List<Employe> list = employeDAO.findAll();
		for (Employe employe : list) {
			System.out.println(employe);
		}
	}

}
