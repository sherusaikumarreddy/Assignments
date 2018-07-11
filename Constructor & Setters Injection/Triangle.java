package com.webapps.Spring;

public class Triangle {
	
private String type;	
private int height;

public Triangle(int height,String type) {
	this.height=height;
	this.type=type;
}

public int getHeight() {
	return height;
}
public void draw() {
	System.out.println(getType() + " Triangle class invokedwhis is of height "+getHeight());
}

private String getType() {
	return type;
}

private String type1;	
private int height1;

public String getType1() {
	return type1;
}

public void setType1(String type1) {
	this.type1 = type1;
}

public int getHeight1() {
	return height1;
}

public void setHeight1(int height1) {
	this.height1 = height1;
}

public void draw1() {
	System.out.println(getType1() + " Triangle class invokedwhis is of height "+getHeight1());
}
}
