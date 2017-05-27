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

import newdrawingthing.StdDraw;
//import numberedcube.NumberedCube;

import java.util.ArrayList;

import newdrawingthing.Coord2D;

public class NewDrawing {
	public static void main(String args[]) {
		int width = 900, height = 900, depth = 900;
		StdDraw.setCanvasSize(width, height); //default is 512 x 512
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

		StdDraw.setPenRadius(.005);
		StdDraw.enableDoubleBuffering();

		Coord2D.focalx = 0;
		Coord2D.focaly = 0;

		Coord2D.d = 1.0 / Math.sqrt(width * width + height * height);
		
		ArrayList<Line> lines = new ArrayList<Line>();
		
		int space = 100;
		
		int z = 300;
		
		for (int m = 0; m < 100; m++) {
			Coord2D coord1 = new Coord2D(m * 900 / space, 0, z);
			Coord2D coord2 = new Coord2D(0, 900 - (m * 900 / space), z);
			
			Coord2D coord3 = new Coord2D(900 - (m * 900 / space), 900, z);
			Coord2D coord4 = new Coord2D(900, m * 900 / space, z);
			Line line1 = new Line(coord1, coord2);
			Line line2 = new Line(coord3, coord4);
			lines.add(line1);
			lines.add(line2);
		}
		
		for (int j = 0; j < 901; j++) {
			for (int i = 0; i < 901; i++) {
				StdDraw.clear();
				
/*				Coord2D.focalx += z;
				Coord2D.focaly += z;*/
				
				for (Line line1 : lines) {
					StdDraw.setPenColor(StdDraw.BLUE);
					line1.draw();
				}
				StdDraw.show();
			}
		}
	}
}
