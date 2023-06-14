package com.pak;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class Main {

	public static void main(String[] args) {
		  
    	//First Employee
    	JSONObject employeeDetails = new JSONObject();
    	employeeDetails.put("firstName", "Lokesh");
    	employeeDetails.put("lastName", "Gupta");
    	employeeDetails.put("website", "howtodoinjava.com");
    	
    	JSONObject employeeObject = new JSONObject(); 
    	employeeObject.put("employee", employeeDetails);
    	
    	//Second Employee
    	JSONObject employeeDetails2 = new JSONObject();
    	employeeDetails2.put("firstName", "Brian");
    	employeeDetails2.put("lastName", "Schultz");
    	employeeDetails2.put("website", "example.com");
    	
    	JSONObject employeeObject2 = new JSONObject(); 
    	employeeObject2.put("employee", employeeDetails2);
    	
    	
    	JSONObject employeeDetails3 = new JSONObject();
    	employeeDetails3.put("firstName", "AA");
    	employeeDetails3.put("lastName", "BB");
    	employeeDetails3.put("website", "CC");
   
    	//Add employees to list
    	JSONArray employeeList = new JSONArray();
    	employeeList.add(employeeObject);
    	employeeList.add(employeeObject2);
    	employeeList.add(employeeDetails3);
    	
    	//
    	 JSONObject inputObj = new JSONObject();
    	 inputObj.put("xx","xxx");
    	 inputObj.put("zz","zzz");
    	
    	 JSONObject map = new JSONObject();
	      map.put("Name", "Adithya");
	      map.put("Age", 25);
	      map.put("DOB", "20/11/80");
	      map.put("City", "Hyderabad");
	      
	      map.put("employee", employeeList);
	      map.put("input", inputObj); 
	      System.out.println(map.toString());
	      
	    
	}

}
