package com.sunbeam;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;





public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stList = new LinkedList<Student>();
		stList.add(new Student(5, "shreyansh",  10));
		stList.add(new Student(3, "shrutika" ,  40));
		stList.add(new Student(2, "akshada"  ,  30));
		stList.add(new Student(4, "jaid"     ,  50));
		stList.add(new Student(1, "atharav"  ,  20));

		
		System.out.println("=======================================================================================");
		System.out.println("Before Sort - ");
		for (Student student : stList)
			System.out.println(student);
		
		
		System.out.println("=======================================================================================");
		System.out.println("After Natural Ordering --> ");
		Collections.sort(stList);
		for (Student student : stList)
			System.out.println(student);
		
		
		System.out.println("=======================================================================================");
		
		class StNameComparator implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
			
			
		}
		
		Comparator<Student>stNameComparator=new StNameComparator();
		Collections.sort(stList,stNameComparator);
		
		for(Student student:stList)
			System.out.println(student);
		
		Student st=new Student();
		st.rollno=4;
		System.out.println("****"+st);
System.out.println(stList.contains(st));
		if(stList.contains(st)) 
			System.out.println("student is present");
		else
			System.out.println("student is absent");
		
		System.out.println("=======================================================================================");
	}

}
