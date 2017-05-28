package newdrawingthing;

import newdrawingthing.Line3D;

/*
*	Grid
*
*	PROGRAMMER: Griffin Myers & Jean Flaherty (05/27/2017)
*
*	DESCRIPTION:
*	Code for making grids in 3D space
*
*	CREDITS:
*	This program is copyright (c) 2017 Griffin Myers & Jean Flaherty.
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
