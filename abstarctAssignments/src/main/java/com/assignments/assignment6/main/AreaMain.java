package com.assignments.assignment6.main;

import com.assignments.assignment5.model.Area;

public class AreaMain {

	public static void main(String[] args) {

		Area area1 = new Area();
		float[] rectanglesAreas = new float[4];
		float[] squareAreas = new float[4];
		double[] circleAreas = new double[5];

		rectanglesAreas[0] = area1.rectangleArea(25f, 35f);
		rectanglesAreas[1] = area1.rectangleArea(45f, 50f);
		rectanglesAreas[2] = area1.rectangleArea(55f, 35f);
		rectanglesAreas[3] = area1.rectangleArea(60f, 65f);

		squareAreas[0] = area1.squareArea(25f);
		squareAreas[1] = area1.squareArea(35.5f);
		squareAreas[2] = area1.squareArea(55.5f);
		squareAreas[3] = area1.squareArea(32.7f);

		circleAreas[0] = area1.circleArea(12.5f);
		circleAreas[1] = area1.circleArea(22.5f);
		circleAreas[2] = area1.circleArea(30.5f);
		circleAreas[3] = area1.circleArea(25.5f);
		circleAreas[4] = area1.circleArea(15.5f);

		for (int i = 0; i < rectanglesAreas.length; i++) {
			System.out.println("Area of Rectangle" + (i + 1) + " is " + rectanglesAreas[i]+ " Sq.Mtr");
		}

		System.out.println();

		for (int i = 0; i < squareAreas.length; i++) {
			System.out.println("Area of Square" + (i + 1) + " is " + squareAreas[i]+ " Sq.Mtr");
		}

		System.out.println();

		for (int i = 0; i < circleAreas.length; i++) {
			System.out.println("Area of Circle" + (i + 1) + " is " + circleAreas[i]+ " Sq.Mtr");
		}

	}

}
