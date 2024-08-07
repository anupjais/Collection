package com.m5col.comparable;

public class Student {

	int sid;
	String sname;
	double sal;
	public Student(int sid, String sname, double sal)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sal=" + sal + "]";
	}
	
	
}
