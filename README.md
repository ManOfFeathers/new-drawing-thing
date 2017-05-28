# New Drawing Thing
Messing with StdDraw in 3D

### Table of contents
* [Coord2D](#coord2d)
* [Coord3D](#coord3d)
* [Line2D](#line2d)
* [Line3D](#line3d)
* [Grid](#grid)

### Coord2D

```java
// attributes
public double x = 0, y = 0;

// constructors
public Coord2D(double x, double y) {...}
```

### Coord3D

```java
// attributes
public double x = 0, y = 0, z = 0;
public static double focalx = 0, focaly = 0;
public static double distortion = 1.0;

// constructors
public Coord3D(double x, double y) {...}
public Coord3D(double x, double y, double z) {...}

// methods
public Coord2D to2D(){...}
```

### Line2D

```java
// attributes
public Coord2D start, end;

// constructors
public Line2D(Coord2D start, Coord2D end){...}
public Line2D(double x1, double y1, double x2, double y2){...}

// methods
public void draw() {...}
```

### Line3D

```java
// attributes
public Coord3D start, end;

// constructors
public Line3D(Coord3D start, Coord3D end) {...}
public Line3D(double x1, double y1, double x2, double y2) {...}
public Line3D(double x1, double y1, double z1, double x2, double y2, double z2) {...}

// methods
public void draw() {...}
```

### Grid

```java
// methods
public static Line3D[] generateLines(double space, double width, double height, double depth) {...}
```
