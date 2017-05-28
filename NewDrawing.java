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

		ArrayList<Line3D> blueLines = new ArrayList<Line3D>();
		ArrayList<Line3D> redLines = new ArrayList<Line3D>();
		ArrayList<Line3D> greenLines = new ArrayList<Line3D>();
		ArrayList<Line3D> yellowLines = new ArrayList<Line3D>();

		int space = 250;

		int z = 0;

		for (int m = 0; m < space; m++) {
			Coord3D coord1 = new Coord3D(0, 0, m * depth / space);
			Coord3D coord2 = new Coord3D(0, m * height / space, depth);

			Coord3D coord3 = new Coord3D(width - (m * width / space), height, depth);
			Coord3D coord4 = new Coord3D(width, height, m * depth / space);
			
			Coord3D coord5 = new Coord3D(0, 0, m * height / space);
			Coord3D coord6 = new Coord3D(m * width / space, 0, depth);
			
			Coord3D coord7 = new Coord3D(width, height - (m * height / space), depth);
			Coord3D coord8 = new Coord3D(width, height, m * depth / space);
			
			Coord3D coord9 = new Coord3D(m * width / space, height, depth);
			Coord3D coord10 = new Coord3D(0, height, m * depth / space);
			
			Coord3D coord11 = new Coord3D(0, height - (m * height / space), depth);
			Coord3D coord12 = new Coord3D(0, height, m * depth / space);
			
			Coord3D coord13 = new Coord3D(width - (m * width / space), 0, depth);
			Coord3D coord14 = new Coord3D(width, 0, m * depth / space);	
			
			Coord3D coord15 = new Coord3D(width, m * width / space, depth);
			Coord3D coord16 = new Coord3D(width, 0, m * depth / space);	
		
			Line3D line1 = new Line3D(coord1, coord2);
			Line3D line2 = new Line3D(coord3, coord4);
			
			Line3D line3 = new Line3D(coord5, coord6);
			Line3D line4 = new Line3D(coord7, coord8);
			
			Line3D line5 = new Line3D(coord9, coord10);
			Line3D line6 = new Line3D(coord11, coord12);
			
			Line3D line7 = new Line3D(coord13, coord14);
			Line3D line8 = new Line3D(coord15, coord16);
		
			blueLines.add(line1);
			redLines.add(line2);
			greenLines.add(line3);
			yellowLines.add(line4);
			greenLines.add(line5);
			yellowLines.add(line6);
			redLines.add(line7);
			blueLines.add(line8);
		}

		for (Line3D line1 : blueLines) {
			StdDraw.setPenColor(StdDraw.BLUE);
			line1.draw();
		}
		StdDraw.show();
		
		for (Line3D line1 : redLines) {
			StdDraw.setPenColor(StdDraw.RED);
			line1.draw();
		}
		StdDraw.show();
		
		for (Line3D line1 : greenLines) {
			StdDraw.setPenColor(StdDraw.GREEN);
			line1.draw();
		}
		StdDraw.show();
		
		for (Line3D line1 : yellowLines) {
			StdDraw.setPenColor(StdDraw.YELLOW);
			line1.draw();
		}
		StdDraw.show();
		
/*		while (true) {
			StdDraw.clear();
			Coord3D.focalx = StdDraw.mouseX();
			Coord3D.focaly = StdDraw.mouseY();
			for (Line3D line1 : lines) {
				StdDraw.setPenColor(StdDraw.BLUE);
				line1.draw();
			}
			StdDraw.show();
			StdDraw.pause(30);
		}*/
	}
}
