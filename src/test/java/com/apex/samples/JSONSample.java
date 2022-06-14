package com.apex.samples;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;


public class JSONSample  {

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
    
    
    public static void main(String[] args) throws IOException {
    	
		
		
		/*
		 * Staff staff = createStaff(); String jsonString =
		 * getJSONFromJavaObject(staff); System.out.println(jsonString);
		 */
		 
		 
    	
		
		
		   String jsonString = "{\"name\":\"mkyong\",\"age\":38,\"position\":" + 
		  "[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":"
		   + "{\"2018\":14000,\"2012\":12000,\"2010\":10000}}";  
		   
		   Staff staff = getJavaObjectFromJSON(jsonString); 
		   System.out.println(staff.getName());
		 		 
    }
        private static Staff createStaff() {

            Staff staff = new Staff();

            staff.setName("mkyong");
            staff.setAge(38);
            staff.setPosition(new String[]{"Founder", "CTO", "Writer"});
            List<String> skills = new ArrayList<String>();
            skills.add("java");
            skills.add("python");
            skills.add("node");
            skills.add("kotlin");
            Map<String, BigDecimal> salary = new HashMap() {{
                put("2010", new BigDecimal(10000));
                put("2012", new BigDecimal(12000));
                put("2018", new BigDecimal(14000));
            }};
            
            staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));
            staff.setSkills(skills);
            staff.setSalary(salary);
            return staff;

        }

}

// 