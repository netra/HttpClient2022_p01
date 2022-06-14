package com.apex.core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.apex.User_Test.bean.User;
import com.apex.samples.Staff;

public class ApexXMLUtil {

	public static String getXMLFromJavaObject(Staff staff1) throws JAXBException {

		JAXBContext contextObj = JAXBContext.newInstance(Staff.class);

		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		StringWriter sw = new StringWriter();

		// Write XML to StringWriter
		marshallerObj.marshal(staff1, sw);

		// Verify XML Content
		String xmlContent = sw.toString();
		System.out.println(xmlContent);

		return xmlContent;

	}

	public static User getJavaObjectFromXML(String xmlstring) {

		return null;

	}

	private static Staff createStaff() {

		String[] position = { "Founder", "CTO", "Writer" };
		List<String> skills = new ArrayList<String>();
		skills.add("java");
		skills.add("python");
		skills.add("node");
		skills.add("kotlin");
		Map<String, BigDecimal> salary = new HashMap<String, BigDecimal>();
		salary.put("2018", new BigDecimal("140000"));
		salary.put("2012", new BigDecimal("120000"));
		salary.put("2010", new BigDecimal("100000"));

		Staff staff = new Staff("mkyong", 38, position, skills, salary);
		return staff;

	}

	public static void main(String[] args) throws IOException, JAXBException {

		Staff staff1 = createStaff();

		// Verify XML Content
		String xmlcon = getXMLFromJavaObject(staff1);

		//marshallerObj.marshal(staff1, new FileOutputStream("myFirst.xml"));

	}

}
