package com.spsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spsp.model.Enquiry;
import com.spsp.serviceI.OperationalExecutiveServiceI;

@CrossOrigin("*")
@RestController
public class OperationExecutive {
	
	@Autowired
	OperationalExecutiveServiceI oe;
	
	@PostMapping("/postoe")
	public Enquiry saveData(@RequestBody Enquiry e)
	{
		return oe.saveEnquiry(e);
	}
	
	
}
