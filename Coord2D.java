package newdrawingthing;

/*
*	CS102 Final Project
*
*	PROGRAMMER: Griffin Myers (4/26/2017)
*	CLASS: CS102
*	SEMESTER: Spring 2017
*	INSTRUCTOR: Tom Jensen
*
*	DESCRIPTION:
*	This project attempts to manipulate the StdDraw code to
*	create abstract 3D images.
*
*	EXTERNAL LIBRARIES:
*	The StdDraw graphic library. Available at:
*	http://introcs.cs.princeton.edu/java/stdlib/
*
*	CREDITS:
*	This program is copyright (c) 2017 Griffin Myers.
*
*/

public class Coord2D {
	public double x = 0, y = 0;
	public static double focalx = 0, focaly = 0;
	public static double d = 1;
	
	public Coord2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Coord2D(double x, double y, double z) {
		x = x - focalx;
		y = y - focaly;
		
		z = z * d;
		z++;
	
		x = x / z;
		y = y / z;
		
		x = x + focalx;
		y = y + focaly;
		
		this.x = x;
		this.y = y;
	
	}
}