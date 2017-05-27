package newdrawingthing;

import newdrawingthing.Coord2D;

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

        double temp_z = z * distortion;
        temp_z++;

        x2d = x2d / temp_z;
        y2d = y2d / temp_z;

        x2d = x2d + focalx;
        y2d = y2d + focaly;

        return new Coord2D(x2d,y2d);
    }
}
