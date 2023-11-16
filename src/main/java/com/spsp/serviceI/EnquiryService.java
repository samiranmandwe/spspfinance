package com.spsp.serviceI;

import java.util.List;
import java.util.Optional;

import com.spsp.model.CibilScore;
import com.spsp.model.Enquiry;

public interface EnquiryService {
	
	public Enquiry saveEnquiry(Enquiry e);
	
	public Iterable<Enquiry> getAll();
	
	public Iterable<CibilScore> getAllCibil();
	
	public void deleteCibil(int id);
	
	public void deleteEnquiry(int id);
	
//	public Optional<Enquiry> getById(int id);



}
