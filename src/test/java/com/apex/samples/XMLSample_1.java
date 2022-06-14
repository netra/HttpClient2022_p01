package com.apex.samples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class XMLSample_1 {
	
	public static void main(String[] args) throws JAXBException, IOException {
		
		JAXBContext contextObj = JAXBContext.newInstance(Staff.class);  
		  
	    Marshaller marshallerObj = contextObj.createMarshaller();  
	    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
	    
	   // Staff staff = new Staff("mkyong",38);
	    String [] position = {"Founder","CTO", "Writer"};
	    List<String> skills = new ArrayList<String>();
	    skills.add("java");
	    skills.add("python");
	    skills.add("node");
	    skills.add("kotlin");
	    Map<String, BigDecimal> salary =new HashMap<String, BigDecimal>();
	    salary.put("2018", new BigDecimal("140000"));
	    salary.put("2012", new BigDecimal("120000"));
	    salary.put("2010", new BigDecimal("100000"));
    	
	     
	    Staff staff1 = new Staff("mkyong",38,position,skills,salary);
	    StringWriter sw = new StringWriter();
	    
        //Write XML to StringWriter
	    marshallerObj.marshal(staff1, sw);
         
        //Verify XML Content
        String xmlContent = sw.toString();
        System.out.println( xmlContent );
        
        
	    
	    marshallerObj.marshal(staff1, new FileOutputStream("myFirst.xml"));  

		
	}
	

}
