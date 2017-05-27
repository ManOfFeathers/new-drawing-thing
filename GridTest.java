package newdrawingthing;

import newdrawingthing.StdDraw;
import newdrawingthing.Coord3D;

public class GridTest {
	public static void main(String args[]) {
		int width = 900, height = 900, depth = 900;
		StdDraw.setCanvasSize(width, height); //default is 512 x 512
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

		StdDraw.enableDoubleBuffering();

		Coord3D.focalx = 0;
		Coord3D.focaly = 0;
		Coord3D.distortion = 1.0 / Math.sqrt(width * width + height * height);

        Line3D gridLines[] = Grid.generateLines(75, width, height, depth);

        while (true) {
			StdDraw.clear();
			Coord3D.focalx = StdDraw.mouseX();
			Coord3D.focaly = StdDraw.mouseY();

    		for (Line3D line : gridLines) {
    			StdDraw.setPenColor(StdDraw.BLUE);
    			line.draw();
    		}
            StdDraw.show();
            StdDraw.pause(30);
        }

	}
}
