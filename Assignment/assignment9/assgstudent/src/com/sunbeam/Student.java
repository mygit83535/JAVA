package com.sunbeam;

import java.util.Objects;




public class Student implements Comparable<Student>{

	int rollno;
	String name;
	double mark;
	public Student(int rollno, String name, double mark) {
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mark, name, rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (obj instanceof Student) {
			Student e = (Student) obj;
			return e.rollno == this.rollno;
		}
		return false;
	}
	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;
	}

}
