package com.assignments.assignment5.model;

public class Area extends ShapesAbstract {

	@Override
	public float rectangleArea(float length, float breadth) {
		return length*breadth;
	}

	@Override
	public double circleArea(float radius) {
		return (3.14*(radius*radius));
	}

	@Override
	public float squareArea(float side) {
		return (side*side);
	}

}
