package com.sai.android.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sai.android.data.Employ;
import com.sai.android.repository.EmployRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class HelloController {

	@GetMapping("/Hello")
	public String sayHello(@RequestParam String name) {
		return "Hello" + name;
	}

	@Autowired
	EmployRepository emRepo;

	@GetMapping("/getAllEmploys")
	public List<Employ> getAllEmploys() {
		List<Employ> emLst = emRepo.findAll();
		return emLst;
	}

	@PostMapping("/insertUpdate")
	public String insertEmployData(@RequestBody Employ emObj) {
		System.out.println("recieved data to insert is: " + emObj);
		Employ emSavedObj = emRepo.save(emObj);
		System.out.println("object saved in db is :" + emSavedObj);
		return "Employee record is inserted in the database successfully";
	}

	@PutMapping("/updateEmploy")
	public String updateEmploy(@RequestBody Employ emObj) {
		System.out.println("recieved employee data to update is:" + emObj);
		Employ emSavedObj = emRepo.save(emObj);
		System.out.println("object saved in the db is :" + emSavedObj);
		return "employee data is updated in the db successfully";
	}

	@DeleteMapping(path = "/deleteData/{id}")
	public String deleteData(@PathVariable int id) {
		System.out.println("employee record deleted with given id" + id);
		emRepo.deleteById(id);
		return "deleted successfully";
	}
}
