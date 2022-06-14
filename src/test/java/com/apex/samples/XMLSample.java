package com.apex.samples;

import java.io.FileOutputStream;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBElement;

public class XMLSample {
	
	public static String getJXMLFromJavaObject(Staff staff) throws JAXBException {
		    
		    JAXBContext contextObj = JAXBContext.newInstance(Staff.class);  
		  
		    Marshaller marshallerObj = contextObj.createMarshaller();  
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    
		    
		    StringWriter sw = new StringWriter();
		   
		    QName qName = new QName("com.codenotfound.jaxb.model", "staff");
		    JAXBElement<Staff> root = new JAXBElement<Staff>(qName, Staff.class, staff);
		    
		    marshallerObj.marshal(root, sw);
	        //Write XML to StringWriter
		    marshallerObj.marshal(staff, sw);
		     
	        //Verify XML Content
	        String xmlContent = sw.toString();
	        System.out.println( xmlContent );
		 
		 return xmlContent;
		 
		 
	 }

	public static void main(String[] args) throws JAXBException {

		Staff staff = createStaff();
		String xmlContent = getJXMLFromJavaObject(staff);
		 System.out.println( xmlContent );
		 
		
	}
	 

	

	private static Staff createStaff() {

		//Staff staff = new Staff();

		//staff.setName("mkyong");
		//staff.setAge(38);
		//staff.setPosition(new String[] { "Founder", "CTO", "Writer" });
		 String [] position = {"Founder","CTO", "Writer"};
		List<String> skills = new ArrayList<String>();
		skills.add("java");
		skills.add("python");
		skills.add("node");
		skills.add("kotlin");
		Map<String, BigDecimal> salary = new HashMap() {
			{
				put("2010", new BigDecimal(10000));
				put("2012", new BigDecimal(12000));
				put("2018", new BigDecimal(14000));
			}
		};
		
		Staff staff = new Staff("mkyong",38,position,skills,salary);

		/*
		 * staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));
		 * staff.setSkills(skills); staff.setSalary(salary);
		 */
		return staff;

	}

}
