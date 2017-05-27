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

import newdrawingthing.Coord2D;

public class NewDrawing {
	public static void main(String args[]) {
		int width = 900, height = 900, depth = 900;
		StdDraw.setCanvasSize(width, height); //default is 512 x 512
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

		StdDraw.enableDoubleBuffering();

		Coord2D.focalx = 0;
		Coord2D.focaly = 0;

		Coord2D.d = 1.0 / Math.sqrt(width * width + height * height);
		for (int i = 0; i < 901; i++) {
			StdDraw.clear();
			Coord2D.focalx = i / 2;
			Coord2D.focaly = i / 2;

/*			for (int h = 900; h >= 0; h--) {
				Coord2D coord1 = new Coord2D(h,0);
			}

			for (int j = 0; 0 <= 900; j++) {
				Coord2D coord2 = new Coord2D(0,j);
			}*/

			System.out.println("Jean");

			Coord2D coord1 = new Coord2D(900,0);
			Coord2D coord2 = new Coord2D(0,100);
			Coord2D coord3 = new Coord2D(800,0);
			Coord2D coord4 = new Coord2D(0,200);
			Coord2D coord5 = new Coord2D(700,0);
			Coord2D coord6 = new Coord2D(0,300);
			Coord2D coord7 = new Coord2D(600,0);
			Coord2D coord8 = new Coord2D(0,400);
			Coord2D coord9 = new Coord2D(500,0);
			Coord2D coord10 = new Coord2D(0,500);
			Coord2D coord11 = new Coord2D(400,0);
			Coord2D coord12 = new Coord2D(0,600);
			Coord2D coord13 = new Coord2D(300,0);
			Coord2D coord14 = new Coord2D(0,700);
			Coord2D coord15 = new Coord2D(200,0);
			Coord2D coord16 = new Coord2D(0,800);
			Coord2D coord17 = new Coord2D(100,0);
			Coord2D coord18 = new Coord2D(0,900);


			Coord2D coord19 = new Coord2D(800,900);
			Coord2D coord20 = new Coord2D(900,100);

			Coord2D coord21 = new Coord2D(700,900);
			Coord2D coord22 = new Coord2D(900,200);

			Coord2D coord23 = new Coord2D(600,900);
			Coord2D coord24 = new Coord2D(900,300);

			Coord2D coord25 = new Coord2D(500,900);
			Coord2D coord26 = new Coord2D(900,400);

			Coord2D coord27 = new Coord2D(400,900);
			Coord2D coord28 = new Coord2D(900,500);

			Coord2D coord29 = new Coord2D(300,900);
			Coord2D coord30 = new Coord2D(900,600);

			Coord2D coord31 = new Coord2D(200,900);
			Coord2D coord32 = new Coord2D(900,700);

			Coord2D coord33 = new Coord2D(100,900);
			Coord2D coord34 = new Coord2D(900,800);

			int evenMoreNumLines = 18;
			Line evenMoreLines[] = new Line[evenMoreNumLines];

			evenMoreLines[0] = new Line(coord1, coord2);
			evenMoreLines[1] = new Line(coord3, coord4);
			evenMoreLines[2] = new Line(coord5, coord6);

			evenMoreLines[3] = new Line(coord7, coord8);
			evenMoreLines[4] = new Line(coord9, coord10);
			evenMoreLines[5] = new Line(coord11, coord12);

			evenMoreLines[6] = new Line(coord13, coord14);
			evenMoreLines[7] = new Line(coord15, coord16);
			evenMoreLines[8] = new Line(coord17, coord18);

			evenMoreLines[9] = new Line(coord19, coord1);
			evenMoreLines[10] = new Line(coord21, coord20);
			evenMoreLines[11] = new Line(coord23, coord22);

			evenMoreLines[12] = new Line(coord25, coord24);
			evenMoreLines[13] = new Line(coord27, coord26);
			evenMoreLines[14] = new Line(coord29, coord28);

			evenMoreLines[15] = new Line(coord31, coord30);
			evenMoreLines[16] = new Line(coord33, coord32);
			evenMoreLines[17] = new Line(coord18, coord34);

/*			for (int g = 0; g < evenMoreNumLines; g++) {
				evenMoreLines[g] = new Line(coord1, coord2);
			}*/

			for (int f = 0; f < evenMoreNumLines; f++) {
				StdDraw.setPenColor(StdDraw.BLUE);
				evenMoreLines[f].draw();
			}
			StdDraw.show();

/*			for (int j = 0; j < evenMoreNumLines; j++) {
				for (int xCoord = 0; xCoord < coord1.x; xCoord++) {
					xCoord--;
				}
				for (int yCoord = 0; yCoord < coord2.y; yCoord++) {
					yCoord--;
				}
				evenMoreLines[j] = new Line(coord1, coord2);
			}*/
		}

	}
}
