package com.spsp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.spsp.Repository.CibilRepo;
import com.spsp.Repository.EnquiryRepository;
import com.spsp.model.CibilScore;
import com.spsp.model.Enquiry;
import com.spsp.serviceI.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService {
	
	@Autowired
	EnquiryRepository er;
	
	@Autowired
	CibilRepo cr;

	@Override
	public Enquiry saveEnquiry(Enquiry e) {
		return er.save(e);
	}

	@Override
	public Iterable<Enquiry> getAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Iterable<CibilScore> getAllCibil() {
		return cr.findAll();
	}

	@Override
	public void deleteCibil(@PathVariable int id) {
		 cr.deleteById(id);
	}

	@Override
	public void deleteEnquiry(int id) {
		er.deleteById(id);
	}
	
//	@Override
//	public Optional<Enquiry> getById(int id)
//	{
//		return er.findById(id);
//	}
	

}
