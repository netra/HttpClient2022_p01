package com.apex.samples;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class XMLSample_2 {

	public static void main(String[] args) {
		

		  try {  
			   
		        File file = new File("myFirst.xml");  
		        JAXBContext jaxbContext = JAXBContext.newInstance(Staff.class);  
		   
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        Staff staff1= (Staff) jaxbUnmarshaller.unmarshal(file);  
		          
		        System.out.println(staff1.getAge()+" "+staff1.getName());  
		        //System.out.println(staff1.getPosition());
		        System.out.println(staff1.getSkills());
		        System.out.println(staff1.getSalary());
		        
				/* Arrays.toString(array)
				 * //System.out.println("The output :"); String [] position = {"Founder","CTO",
				 * "Writer"}; System.out.println(Arrays.toString(position)); List<String> list =
				 * new ArrayList<String>(); // list.add("java"); // list.add("python"); //
				 * list.add("node"); // list.add("kotlin"); // System.out.println(list);
				 * for(String l:list) System.out.println(l);
				 * 
				 * Map<String, BigDecimal> map =new HashMap<String, BigDecimal>();
				 * map.put("2018", new BigDecimal("140000")); map.put("2012", new
				 * BigDecimal("120000")); map.put("2010", new BigDecimal("100000"));
				 * System.out.println(map);
				 */
	      } 
		        catch (JAXBException e) {  
		        e.printStackTrace();  
		      }
	}

}
