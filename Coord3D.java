package newdrawingthing;

import newdrawingthing.Coord2D;

/*
*	Coord 3D
*
*	PROGRAMMER: Griffin Myers & Jean Flaherty (05/27/2017)
*
*	DESCRIPTION:
*	Code for making coordinates in 3D space
*
*	CREDITS:
*	This program is copyright (c) 2017 Griffin Myers & Jean Flaherty.
*
*/

public class Coord3D {
	public double x = 0, y = 0, z = 0;
	public static double focalx = 0, focaly = 0;
	public static double distortion = 1;

	public Coord3D(double x, double y) {
		this.x = x;
		this.y = y;
        this.z = 0;
	}

	public Coord3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
	}

    public Coord2D to2D(){
        // treat focal point as origin
        double x2d = x - focalx;
        double y2d = y - focaly;

        // scale of the coordinate
        double zscale = z * distortion;
        zscale++; // avoid divide by zero

        // weak perspective projection
        x2d = x2d / zscale;
        y2d = y2d / zscale;

        // reset origin back to original
        x2d = x2d + focalx;
        y2d = y2d + focaly;

        return new Coord2D(x2d,y2d);
    }
}
