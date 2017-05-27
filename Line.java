package newdrawingthing;
import newdrawingthing.StdDraw;

/*
*	CS102 Final Project
*
*	PROGRAMMER: Griffin Myers (4/24/2017)
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

public class Line {
	
	public Coord2D start, end;
	
	public Line(Coord2D start, Coord2D end) {
		this.start = start;
		this.end = end;
	}
	
	public Line(double x1, double y1, double x2, double y2) {
		Coord2D start = new Coord2D(x1,y1);
		Coord2D end = new Coord2D(x2,y2);
		this.start = start;
		this.end = end;
	}
	
	public Line(double x1, double y1, double z1, double x2, double y2, double z2) {
		Coord2D start = new Coord2D(x1,y1,z1);
		Coord2D end = new Coord2D(x2,y2,z2);
		this.start = start;
		this.end = end;
	}
	
	public void draw() {
		StdDraw.line(this.start.x, this.start.y, this.end.x, this.end.y);
	}
}