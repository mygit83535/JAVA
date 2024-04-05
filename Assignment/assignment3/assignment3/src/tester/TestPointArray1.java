package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of points to plot:");
		int numberOfPoints = sc.nextInt();

		Point2D[] points = new Point2D[numberOfPoints];

		for (int i = 0; i < points.length; i++) {
			System.out.println("Enter x co-ordinate for point" + (i + 1) + ":");
			double x = sc.nextDouble();
			System.out.println("Enter y co-ordinate for point" + (i + 1) + ":");
			double y = sc.nextDouble();
			points[i] = new Point2D(x, y);
		}

		int choice;
		do 
		{
			System.out.println("\nMenu:");
			System.out.println("1.Display details of a Specific Point");
			System.out.println("2.Display x,y co-ordinates of all points");
			System.out.println("3.Calculate distance between two points");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				displayPointdetails(points, sc);
				break;
			case 2:
				displayAllPoints(points);
				break;
			case 3:
				calculateDistance(points, sc);
				break;
			case 4:
				System.out.println("Thank You For Using App...");
				break;
			default:
				System.out.println("*****Invalid choice*****");

			}
		} while (choice != 4);

	}

	public static void displayPointdetails(Point2D[] points, Scanner sc) 
	{
		System.out.println("Enter the index of the point starting from 0:");
		int index = sc.nextInt();
		if (index >= 0 && index <= points.length) 
			{
				System.out.println("Details of all point" + index + ":" + points[index].getDetails());
			} 
		else 
			{
				System.out.println("Invalid index.");
			}
	}
	
	private static void displayAllPoints(Point2D[] points) 
	{
		System.out.println("Details of all Points:");
		for(int i=0;i<points.length;i++)
		{
			System.out.println("Point"+i+":"+points[i].getDetails());
		}
	}
	

	private static void calculateDistance(Point2D[] points, Scanner sc) 
	{
				System.out.println("Enter index of start point:");
				int startIndex=sc.nextInt();
				System.out.println("Enter index of end point:");
				int endIndex=sc.nextInt();
				
				if(startIndex>=0 && startIndex <points.length && endIndex >=0 && endIndex<points.length)
					{
					if(!points[startIndex].isEqual(points[endIndex]))
						{
							double distance=points[startIndex].calculateDistance(points[endIndex]);
							System.out.println("Distance between point "+startIndex+" and point "+endIndex+" :"+distance);
						}
					else
						{
							System.out.println("Points are at the same position.");
						}
					}
				else
					{
						System.out.println("Invalid selection.");
					}
	}


}