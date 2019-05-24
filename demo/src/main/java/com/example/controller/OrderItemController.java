package com.example.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.OrderItem;
import com.example.service.OrderItemService;

@RestController
@RequestMapping("/Order")
@ComponentScan(basePackages = {"com.example"})
public class OrderItemController {
	
	 @Autowired(required = true)
	 public OrderItemService orderItemService;
	 
	  @RequestMapping("{id}") 
	  public OrderItem getPerson(@PathVariable("id")String pId) {
		  return orderItemService.getPerson(pId);
		  }

	  @RequestMapping("/getAllOrderDetails")
	  public HashMap<String,OrderItem> getAllPersonsDetails()
	  { 
		  return orderItemService.getAllPersons();
		  }
	 
}
