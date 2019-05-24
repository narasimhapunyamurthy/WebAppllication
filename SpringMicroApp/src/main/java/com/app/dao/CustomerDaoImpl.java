package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Customer;

@Service
public class CustomerDaoImpl implements CustomerDao{

	@Override
	public List<Customer> getAllCustomer() {
List<Customer> empList=new ArrayList<Customer>();
		Customer cust1=new Customer(101,"RamKey","Hyd");
		Customer cust2=new Customer(102,"Narasimha","Gnt");
		Customer cust3=new Customer(103,"Ravi","Vij");
		empList.add(cust1);
		empList.add(cust2);
		empList.add(cust3);
		return empList;	
		}

}
