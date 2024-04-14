
package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class student {

	class Student {
		private int roll;
		private String name;
		private String city;
		private double marks;

		public Student() {

		}

		public Student(int roll, String name, String city, double marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.city = city;
			this.marks = marks;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public double getMarks() {
			return marks;
		}

		public void setMarks(double marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
		}

	}

	public class test {

		public  void main(String[] args) 
	    {
	       
	        	{
	        		Student arr[] =new Student[5];
	        		 arr[0] = new Student(83535, "akshada", "islampur", 85.00);
	        		 arr[1] =new Student(83529, "shrutika", "tasgaon", 78);
	        		 arr[2] =new Student(83523, "atharva", "magalvedha", 92);
	        		 arr[3] = new Student(83524, "jaid", "kolhapur", 81);
	        		 arr[4] = new Student(83520, "shreyansh", "kolhapur", 81);
	        		 
	        	}

	        Scanner sc = new Scanner(System.in);
	        int choice ;

	        while (true) {
	            System.out.println("Menu:");
	            System.out.println("1. Sort by City (ASC)");
	            System.out.println("2. Sort by Marks (DESC)");
	            System.out.println("3. Sort by Name (ASC)");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice=sc.nextInt();               

	            if (choice == 4) {
	                System.out.println("Exiting program...");
	                break;
	            }

	            Comparator<Student> comparator = null;

	            switch (choice) {
	                case 1:
	                    comparator = Comparator.comparing(Student::getCity);
	                    break;
	                case 2:
	                    comparator = Comparator.comparing(Student::getMarks).reversed();
	                    break;
	                case 3:
	                    comparator = Comparator.comparing(Student::getName);
	                    break;
	                default:
	                    System.out.println("Invalid choice, please try again.");
	                    continue;
	            }

	            Arrays.sort(Student, comparator);
	            System.out.println("Sorted Students:");
	            for (Student student : arr) {
	                System.out.println(student);
	            }
	        }
	    }
