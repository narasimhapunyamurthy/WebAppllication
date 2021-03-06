package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.CustomerDao;
import com.app.model.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDao custDao;
	@RequestMapping(value="getAllCustomers",method = RequestMethod.GET)
	public List<Customer> getAllCustomer(){
		
		return custDao.getAllCustomer();
	}

}
