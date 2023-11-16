package com.spsp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spsp.Repository.EnquiryRepository;
import com.spsp.model.CibilScore;
import com.spsp.model.Enquiry;
import com.spsp.serviceI.EnquiryService;

@CrossOrigin("*")
@RestController
public class EnquiryController {
	
	@Autowired
	EnquiryService es;
	
	@Autowired
	EnquiryRepository er;
	
	
	
	@PostMapping("/saveData")
	public Enquiry saveData(@RequestBody Enquiry e)
	{
		return es.saveEnquiry(e);
	}
	
	@GetMapping("/getData")
	public Iterable<Enquiry> getAll()
	{
		return es.getAll();
	}
	
	@GetMapping("/getSingleData/{id}")
	public Optional<Enquiry> getById(@PathVariable int id)
	{
		return er.findById(id);
	}
	
	//////////////////////
	
//	@GetMapping("/getSingleData/{id}")
//	public List<Enquiry> getByUnameAndPass(@PathVariable int id)
//	{
//	 es.getById(id);
//	 	
//	 Iterable<Enquiry> list = es.getAll();
//	 
//	 if(uname.equals("a") && pass.equals("a"))
//	 {
//		 return (List) list;
//	 }
//	 else
//	 {
//		 List<Enquiry> list2 = es.getByUnameAndPass(uname, pass);
//		 return list2;
//	 }
//	 
//	}
	 
	
	
	@PutMapping("/updateData/{id}")
	public Enquiry updateData(@RequestBody Enquiry e, @PathVariable int id)
	{
		return es.saveEnquiry(e);
	}
	
	@DeleteMapping("/deleteEnquiry/{id}")
	public void deleteEnquiry(@PathVariable int id)
	{
		es.deleteEnquiry(id);
	}
	
	
	///////////////// cibil ////////////////
	
	
	@GetMapping("/getCibilData")
	public Iterable<CibilScore> getAllCibil()
	{
		return es.getAllCibil();
	}
	
	@DeleteMapping("/deletecbil/{id}")
	public void deleteCibil(@PathVariable int id)
	{
		 es.deleteCibil(id);
	}

}
