package com.lastcourse.exercises.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lastcourse.exercises.model.Billionaires;
import com.lastcourse.exercises.repository.BillionairesRepository;

@RestController
public class BillionairesController {

	@Autowired
	private BillionairesRepository repository;
	
	
	@GetMapping("/api/billionaires")
	public List<Billionaires> getBillionaires(){
		List<Billionaires> billionaires = repository.findAll();
		System.out.println("Billionaires retrieved");
		return billionaires;
	}	
	
	@PostMapping("/api/billionaires/post")
	public int saveBillionaire(@RequestBody Billionaires billionaire) {
		repository.save(billionaire);
		System.out.println("Billionaire saved");
		return billionaire.getId();
	}
	

	@PutMapping("/api/billionaires/put/{id}")
	public void updateBillionaire(@RequestBody Billionaires billionaire, @PathVariable(value="id") Integer id) {
		Billionaires theBillionaire = repository.getOne(id);
		theBillionaire.setFirst_name(billionaire.getFirst_name());
		theBillionaire.setLast_name(billionaire.getLast_name());
		theBillionaire.setCareer(billionaire.getCareer());
		repository.save(theBillionaire);
		System.out.println("Billionaire updated");
	}
	
	
	@DeleteMapping("/api/billionaires/delete/{id}")
	public void deleteBillionaire(@PathVariable (value="id") Integer id) {
		repository.deleteById(id);
		System.out.println("Billionaire deleted");
	}
	
	
	
	
	
	
	
	
		
}
