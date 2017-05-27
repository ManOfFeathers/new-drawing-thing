package newdrawingthing;

import newdrawingthing.StdDraw;

import java.util.ArrayList;

import newdrawingthing.Coord3D;

public class NewDrawing {
	public static void main(String args[]) {
		int width = 700, height = 700, depth = 700;
		StdDraw.setCanvasSize(width, height); //default is 512 x 512

		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

		StdDraw.setPenRadius(.0005);
		StdDraw.enableDoubleBuffering();

		Coord3D.focalx = width/2;
		Coord3D.focaly = height/2;
		Coord3D.distortion = 1.0 / Math.sqrt(width * width + height * height);

		ArrayList<Line3D> lines = new ArrayList<Line3D>();

		int space = 500;

		int z = 0;

		for (int m = 0; m < 500; m++) {

			Coord3D coord1 = new Coord3D(0, 0, m * depth / space);
			Coord3D coord2 = new Coord3D(0, width - (m * height / space), z);

			Coord3D coord3 = new Coord3D(width - (m * width / space), height, z);
			Coord3D coord4 = new Coord3D(width, m * height / space, z);
			Line3D line1 = new Line3D(coord1, coord2);
			Line3D line2 = new Line3D(coord3, coord4);
			lines.add(line1);
			lines.add(line2);
		}


		for (int i = 0; i < 901; i++) {
			StdDraw.clear();

			for (Line3D line1 : lines) {
				StdDraw.setPenColor(StdDraw.BLUE);
				line1.draw();

			}
			StdDraw.show();
		}
	}
}
