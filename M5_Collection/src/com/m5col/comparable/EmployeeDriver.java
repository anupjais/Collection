package com.m5col.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	int eid;
	String ename;
	double esal;

	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return eid + ", name = " + ename + ", sal = " + esal + " .";
	}

	@Override
	public int compareTo(Employee o) {
//		if (this.eid < o.eid)
//			return -1;
//		else if (this.eid > o.eid)
//			return 1;
//		return 0;
		return (this.ename.compareTo(o.ename));
	}

}

public class EmployeeDriver {

	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();

		emps.add(new Employee(8, "Ramesh", 123.0));
		emps.add(new Employee(2, "Suresh", 222.0));
		emps.add(new Employee(3, "Mahesh", 987.0));
		emps.add(new Employee(4, "Ganesh", 129.0));
		emps.add(new Employee(7, "Kamlesh", 136.0));
		emps.add(new Employee(9, "Mangesh", 178.0));
		emps.add(new Employee(10, "Kalpesh", 323.0));
		
//		System.out.println(emps);
		for(Employee emp : emps)
			System.out.println(emp);

		System.out.println();
		Collections.sort(emps);
		for(Employee emp : emps)
			System.out.println(emp);
	}

}
