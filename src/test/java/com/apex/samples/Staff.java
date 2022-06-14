package com.apex.samples;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement 
public class Staff {
	
	private String name;
    private int age;
    private String[] position;
    private List<String> skills;
    private Map<String, BigDecimal> salary;
    
	public Staff() {
		super();
	}

	public Staff(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		 
	}
	public Staff(String name, int age, String[] position, List<String> skills, Map<String, BigDecimal> salary) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.skills = skills;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	 @XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	 @XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public String[] getPosition() {
		return position;
	}
	 @XmlElement
	public void setPosition(String[] position) {
		this.position = position;
	}

	public List<String> getSkills() {
		return skills;
	}
	 @XmlElement
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Map<String, BigDecimal> getSalary() {
		return salary;
	}
	 @XmlElement
	public void setSalary(Map<String, BigDecimal> salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", position=" + Arrays.toString(position) + ", skills=" + skills
				+ ", salary=" + salary + "]";
	}

	

	
    

}
