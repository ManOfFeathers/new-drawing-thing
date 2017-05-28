package newdrawingthing;

import newdrawingthing.StdDraw;
import newdrawingthing.Coord3D;

/*
*	Line 3D
*
*	PROGRAMMER: Griffin Myers & Jean Flaherty (05/27/2017)
*
*	DESCRIPTION:
*	Code for making lines in 3D space
*
*	CREDITS:
*	This program is copyright (c) 2017 Griffin Myers & Jean Flaherty.
*
*/

public class Line3D {

	public Coord3D start, end;

	public Line3D(Coord3D start, Coord3D end) {
		this.start = start;
		this.end = end;
	}

	public Line3D(double x1, double y1, double x2, double y2) {
		Coord3D start = new Coord3D(x1,y1);
		Coord3D end = new Coord3D(x2,y2);
		this.start = start;
		this.end = end;
	}

	public Line3D(double x1, double y1, double z1, double x2, double y2, double z2) {
		Coord3D start = new Coord3D(x1,y1,z1);
		Coord3D end = new Coord3D(x2,y2,z2);
		this.start = start;
		this.end = end;
	}

	public void draw() {
        Coord2D start2d = this.start.to2D();
        Coord2D end2d = this.end.to2D();
		StdDraw.line(start2d.x, start2d.y, end2d.x, end2d.y);
	}
}
