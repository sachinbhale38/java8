package com.functions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;



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

public class FunctionDemo2 {
	public static void main(String[] args) {

		Function<Employee, Integer> f = (e) -> {
			int sal = e.salary;
			if (sal >= 10000 && sal <= 40000)
				return sal * 10 / 100;
			else 
				return sal * 20 / 100;

			
		

		};

		List<Employee> le = new ArrayList<Employee>();
		le.add(new Employee("sachin", 55000));
		le.add(new Employee("john", 35000));
		le.add(new Employee("david", 75000));
		le.add(new Employee("smith", 25000));
		le.add(new Employee("satish", 10000));
		


		for (Employee x : le) {
			int bonus = f.apply(x);
			System.out.println("Bonus for "+x.name+"="+bonus);
			
			
		
			
		}

	}

}
