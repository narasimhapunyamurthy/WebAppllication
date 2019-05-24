package com.example.service;

import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.example.model.OrderItem;

@Service
public class OrderItemService {
	HashMap<String, OrderItem> oItemObj = new HashMap<String, OrderItem>();

	public OrderItemService() {
		OrderItem oItem = new OrderItem();
		
		oItem.setoId("102");
		oItem.setoName("Recuve");
		oItem.setoAddress("Hyderabad");
		oItem.setoAge(26);
		oItemObj.put("2", oItem);
		
		oItem.setoId("101");
		oItem.setoName("Narasimha");
		oItem.setoAddress("Hyderabad");
		oItem.setoAge(26);
		oItemObj.put("1", oItem);
	}

	public OrderItem getPerson(String pId) {
		System.out.println("PersonService :: "+pId + " :: "+oItemObj.containsKey(pId));
		if (oItemObj.containsKey(pId)) {
			return oItemObj.get(pId);
		} 
		else {
			return null;
		}
	}

	public HashMap<String, OrderItem> getAllPersons() {
		return oItemObj;
	}
}
