package com.webservice.jaxws;

import java.io.IOException;
import java.net.ServerSocket;
import wsdl.CallWebService;
import wsdl.CallWebService_Service;



public class TestWsdl {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

try{
		CallWebService_Service callWeb=new CallWebService_Service();
		
	
	    ServerSocket Server = new ServerSocket(5000);
		
		CallWebService 	call=callWeb.getCallWebserviceSoap();
		System.out.println("Hi");
		System.out.println("call ::: "+call.add(5,5));
		//System.out.println(call.data("HI"));
		//call.add(48, 2);
		
}
catch(Exception e)
{
	e.printStackTrace();
	System.out.println(e.getMessage());
}

	}

}
