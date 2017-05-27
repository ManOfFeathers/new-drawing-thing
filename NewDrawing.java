package newdrawingthing;

import newdrawingthing.StdDraw;

import java.util.ArrayList;

import newdrawingthing.Coord3D;

public class NewDrawing {
	public static void main(String args[]) {
		int width = 900, height = 900;
		StdDraw.setCanvasSize(width, height); //default is 512 x 512
		
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

		StdDraw.setPenRadius(.0005);
		StdDraw.enableDoubleBuffering();

		Coord3D.focalx = 0;
		Coord3D.focaly = 0;
		Coord3D.distortion = 1.0 / Math.sqrt(width * width + height * height);
		
		ArrayList<Line3D> lines = new ArrayList<Line3D>();
		
		int space = 500;
		
		int z = 0;
		
		for (int m = 0; m < 500; m++) {

			Coord3D coord1 = new Coord3D(m * 900 / space, 0, z);
			Coord3D coord2 = new Coord3D(0, 900 - (m * 900 / space), z);

			Coord3D coord3 = new Coord3D(900 - (m * 900 / space), 900, z);
			Coord3D coord4 = new Coord3D(900, m * 900 / space, z);
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
