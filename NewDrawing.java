package newdrawingthing;

import newdrawingthing.StdDraw;
import newdrawingthing.Coord3D;

public class NewDrawing {
	public static void main(String args[]) {
		int width = 900, height = 900, depth = 900;
		StdDraw.setCanvasSize(width, height); //default is 512 x 512
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

		StdDraw.enableDoubleBuffering();

		Coord3D.focalx = 0;
		Coord3D.focaly = 0;
		Coord3D.distortion = 1.0 / Math.sqrt(width * width + height * height);

		for (int i = 0; i < 901; i++) {
			StdDraw.clear();

			Coord3D coord1 = new Coord3D(900,0);
			Coord3D coord2 = new Coord3D(0,100);
			Coord3D coord3 = new Coord3D(800,0);
			Coord3D coord4 = new Coord3D(0,200);
			Coord3D coord5 = new Coord3D(700,0);
			Coord3D coord6 = new Coord3D(0,300);
			Coord3D coord7 = new Coord3D(600,0);
			Coord3D coord8 = new Coord3D(0,400);
			Coord3D coord9 = new Coord3D(500,0);
			Coord3D coord10 = new Coord3D(0,500);
			Coord3D coord11 = new Coord3D(400,0);
			Coord3D coord12 = new Coord3D(0,600);
			Coord3D coord13 = new Coord3D(300,0);
			Coord3D coord14 = new Coord3D(0,700);
			Coord3D coord15 = new Coord3D(200,0);
			Coord3D coord16 = new Coord3D(0,800);
			Coord3D coord17 = new Coord3D(100,0);
			Coord3D coord18 = new Coord3D(0,900);


			Coord3D coord19 = new Coord3D(800,900);
			Coord3D coord20 = new Coord3D(900,100);

			Coord3D coord21 = new Coord3D(700,900);
			Coord3D coord22 = new Coord3D(900,200);

			Coord3D coord23 = new Coord3D(600,900);
			Coord3D coord24 = new Coord3D(900,300);

			Coord3D coord25 = new Coord3D(500,900);
			Coord3D coord26 = new Coord3D(900,400);

			Coord3D coord27 = new Coord3D(400,900);
			Coord3D coord28 = new Coord3D(900,500);

			Coord3D coord29 = new Coord3D(300,900);
			Coord3D coord30 = new Coord3D(900,600);

			Coord3D coord31 = new Coord3D(200,900);
			Coord3D coord32 = new Coord3D(900,700);

			Coord3D coord33 = new Coord3D(100,900);
			Coord3D coord34 = new Coord3D(900,800);

			int evenMoreLinesNum = 18;
			Line3D evenMoreLines[] = new Line3D[evenMoreLinesNum];

			evenMoreLines[0] = new Line3D(coord1, coord2);
			evenMoreLines[1] = new Line3D(coord3, coord4);
			evenMoreLines[2] = new Line3D(coord5, coord6);

			evenMoreLines[3] = new Line3D(coord7, coord8);
			evenMoreLines[4] = new Line3D(coord9, coord10);
			evenMoreLines[5] = new Line3D(coord11, coord12);

			evenMoreLines[6] = new Line3D(coord13, coord14);
			evenMoreLines[7] = new Line3D(coord15, coord16);
			evenMoreLines[8] = new Line3D(coord17, coord18);

			evenMoreLines[9] = new Line3D(coord19, coord1);
			evenMoreLines[10] = new Line3D(coord21, coord20);
			evenMoreLines[11] = new Line3D(coord23, coord22);

			evenMoreLines[12] = new Line3D(coord25, coord24);
			evenMoreLines[13] = new Line3D(coord27, coord26);
			evenMoreLines[14] = new Line3D(coord29, coord28);

			evenMoreLines[15] = new Line3D(coord31, coord30);
			evenMoreLines[16] = new Line3D(coord33, coord32);
			evenMoreLines[17] = new Line3D(coord18, coord34);

			for (int f = 0; f < evenMoreLinesNum; f++) {
				StdDraw.setPenColor(StdDraw.BLUE);
				evenMoreLines[f].draw();
			}
			StdDraw.show();

		}

	}
}
