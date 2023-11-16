package com.spsp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spsp.model.Enquiry;

@Repository
public interface OperationalExecutiveRepo extends CrudRepository<Enquiry, Integer>{
	

}
