
package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;


public class TestPoint {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Co-ordinates for Point 1(x,y):");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		Point2D p1 = new Point2D(x, y);

		System.out.println("Enter Co-ordinates for Point 2(x,y):");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		Point2D p2 = new Point2D(x2, y2);

		System.out.println("Details of point 1: " + p1.getDetails());
		System.out.println("Details of point 2: " + p2.getDetails());

		if (p1.isEqual(p2)) 
		{
			System.out.println("Points p1 and p2 are located at same position.");
		} 
		else 
		{
			double distance = p1.calculateDistance(p2);
			
			System.out.println("Points p1 and p2 are located at different positions.");
			System.out.println("Distance between p1 and p2:" + distance);
		}
	}

}