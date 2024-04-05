package com.app.geometry;

public class Point2D 
{
	private double x;
	private double y;

	public Point2D(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}

	public String getDetails() 
	{
		String result;
		result = x + "," + y;
		return result;
	}

	public boolean isEqual(Point2D p2) 
	{
		if (this.x == p2.x && this.y == p2.y) 
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}

	public double calculateDistance(Point2D p2) 
	{
		double X = this.x - p2.x;
		double Y = this.y - p2.y;
		System.out.println(Math.sqrt(Math.pow((X), 2)) + Math.pow((Y), 2));
		return Math.sqrt(Math.pow(X, 2)) + Math.pow(Y, 2);

	}
}