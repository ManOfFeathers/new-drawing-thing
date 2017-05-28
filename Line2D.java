package newdrawingthing;

import newdrawingthing.StdDraw;
import newdrawingthing.Coord2D;

/*
*	Line 2D
*
*	PROGRAMMER: Griffin Myers & Jean Flaherty (05/27/2017)
*
*	DESCRIPTION:
*	Code for making lines in 2D space
*
*	CREDITS:
*	This program is copyright (c) 2017 Griffin Myers & Jean Flaherty.
*
*/

public class Line2D {

	public Coord2D start, end;

	public Line2D(Coord2D start, Coord2D end) {
		this.start = start;
		this.end = end;
	}

	public Line2D(double x1, double y1, double x2, double y2) {
		Coord2D start = new Coord2D(x1,y1);
		Coord2D end = new Coord2D(x2,y2);
		this.start = start;
		this.end = end;
	}

	public void draw() {
		StdDraw.line(this.start.x, this.start.y, this.end.x, this.end.y);
	}
}
