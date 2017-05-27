package newdrawingthing;

import newdrawingthing.Line;

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

public class Grid {
	public static Line3D[] generateLines(double space, double width, double height, double depth) {
		int xNum = (int) Math.floor(width / space);
		int yNum = (int) Math.floor(height / space);
		int zNum = (int) Math.floor(depth / space);

		Line3D[] lines = new Line3D[(xNum + yNum) * zNum];
		int nextIndex = 0;
		for (int z = 0; z < zNum; z++) {
			for (int y = 0; y < yNum; y++) {
				lines[nextIndex] = new Line3D(0, y * space, z * space, width, y * space, z * space);
				nextIndex++;
			}

			for (int x = 0; x < xNum; x++) {
				lines[nextIndex] = new Line3D(x * space, 0, z * space, x * space, height, z * space);
				nextIndex++;
			}
		}
		return lines;
	}
}
