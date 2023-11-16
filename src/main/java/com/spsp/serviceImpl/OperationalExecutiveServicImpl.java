package com.spsp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spsp.Repository.OperationalExecutiveRepo;
import com.spsp.model.Enquiry;
import com.spsp.serviceI.OperationalExecutiveServiceI;
@Service
public class OperationalExecutiveServicImpl implements OperationalExecutiveServiceI {
	
	@Autowired
	OperationalExecutiveRepo or;

	@Override
	public Iterable<Enquiry> getAll() {
		return null;
	}

	@Override
	public Enquiry saveEnquiry(Enquiry e) {
		return or.save(e);
	}

}
