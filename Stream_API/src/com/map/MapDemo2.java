package com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String name;
	int salary;
	int experience;

	public Employee(String name, int salary, int experience) {
		super();
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", experience=" + experience + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + experience;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (experience != other.experience)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
}

public class MapDemo2 {

	public static void main(String[] args) {

		List<Employee> le = new ArrayList<Employee>();
		le.add(new Employee("sachin", 55000, 4));
		le.add(new Employee("sachin", 35000, 2));
		le.add(new Employee("sachin", 75000, 5));
		le.add(new Employee("sachin", 25000, 1));
		le.add(new Employee("sachin", 10000, 8));
		


		le.stream().map(e-> e.salary).forEach(value -> System.out.println(value));
		
	
		

	}

}
