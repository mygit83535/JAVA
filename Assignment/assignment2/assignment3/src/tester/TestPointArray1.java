package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPointArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of points to plot:");
		int numPoints = sc.nextInt();
		Point2D[] points = new Point2D[numPoints];

		// Input points
		for (int i = 0; i < numPoints; i++) {
			System.out.println("Enter x-coordinate for point " + (i + 1) + ":");
			double x = sc.nextDouble();
			System.out.println("Enter y-coordinate for point " + (i + 1) + ":");
			double y = sc.nextDouble();
			points[i] = new Point2D(x, y);
		}

		int choice;
		do {
			System.out.println("Menu:");
			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display x, y coordinates of all points");
			System.out.println("3. Display distance between specified points");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				displayPointDetails(points, sc);
				break;
			case 2:
				displayAllPoints(points);
				break;
			case 3:
				calculateAndDisplayDistance(points, sc);
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice, please retry!");
			}
		} while (choice != 4);
		sc.close();
	}

	private static void calculateAndDisplayDistance(Point2D[] points, Scanner sc) {

	}

	private static void displayAllPoints(Point2D[] points) {

	}

	private static void displayPointDetails(Point2D[] points, Scanner sc) {
		
		
	}
	
}