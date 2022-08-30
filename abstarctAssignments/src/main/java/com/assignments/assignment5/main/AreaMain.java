package com.assignments.assignment5.main;
import com.assignments.assignment5.model.*;
public class AreaMain {

	public static void main(String[] args) {
		Area area = new Area();
		
		System.out.println("Area of rectangle is "+area.rectangleArea(25f, 25f));
		System.out.println("Area of Circle is "+area.circleArea(12.5f));
		System.out.println("Area of Square is "+area.squareArea(15f));

	}

}
