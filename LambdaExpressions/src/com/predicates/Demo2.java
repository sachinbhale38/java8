package com.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
}

public class Demo2 {
	public static void main(String[] args) {
		Employee e = new Employee("john", 50000, 4);

		// ex1: sal>30k exp>2 return name
		Predicate<Employee> pr = (emp) -> (emp.salary > 30000 && emp.experience > 3);

		System.out.println(pr.test(e));

		// ex2
		List<Employee> le = new ArrayList<Employee>();
		le.add(new Employee("sachin", 55000, 4));
		le.add(new Employee("sachin", 35000, 2));
		le.add(new Employee("sachin", 75000, 5));
		le.add(new Employee("sachin", 25000, 1));
		le.add(new Employee("sachin", 10000, 8));

		for (Employee empl : le) {
			if (pr.test(empl)) {
				System.out.println(empl);
			}
		}

	}

}
