package com.sortcollection;


public class Employee implements Comparable<Employee>{

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

		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}


