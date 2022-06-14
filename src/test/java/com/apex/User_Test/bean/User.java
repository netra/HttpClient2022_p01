package com.apex.User_Test.bean;

import java.io.StringWriter;

import com.apex.samples.Staff;
import com.google.gson.Gson;

public class User {
	
public static String getJSONFromJavaObject(Staff staff) {
    	

	Gson gson = new Gson();

	// 1. Java object to JSON file
	gson.toJson(staff, new StringWriter());
	
	// 2. Java object to JSON string
	String jsonInString = gson.toJson(staff);
	System.out.println(jsonInString);
	return jsonInString;
	
}
public static Staff getJavaObjectFromJSON(String jsonstring) {
	
	Gson gson = new Gson();
	Staff staff = gson.fromJson(jsonstring, Staff.class);

	System.out.println(staff.getAge());
	return staff;
	
}


}
