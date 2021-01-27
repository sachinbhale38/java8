package com.filter;

import java.util.ArrayList;
import java.util.List;


class Employee {
	String name;
	int salary;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class FilterDemo3 {
	public static void main(String[] args) {
		
		List<Employee> le=new ArrayList<Employee>();
		le.add(new Employee("sachin", 55000));
		le.add(new Employee("john", 35000));
		le.add(new Employee("david", 75000));
		le.add(new Employee("smith", 25000));
		le.add(new Employee("satish", 10000));
		
		le.stream().filter(e->e.salary>30000).forEach(emp->System.out.println(emp.name));

	}

}
