package com.assignments.assignment6.model;

import com.assignments.assignment5.model.ShapesAbstract;

public class Area extends ShapesAbstract {

	@Override
	public float rectangleArea(float length, float breadth) {
		return length*breadth;
	}

	@Override
	public float squareArea(float side) {
		return (side*side);
	}

	@Override
	public double circleArea(float radius) {
		 return (3.14*(radius*radius));
	}

}
