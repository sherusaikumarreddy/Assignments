package com.webapps.Spring;

public class Triangle {
	private Point point1;
	private Point point2;
	private Point point3;

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	

	public void draw() {
		System.out.println("point1 = " + getPoint1().getX()+"," + getPoint1().getY());
		System.out.println("point2 = " + getPoint2().getX()+"," + getPoint2().getY());
		System.out.println("point3 = " + getPoint3().getX()+"," + getPoint3().getY());
	}
}
