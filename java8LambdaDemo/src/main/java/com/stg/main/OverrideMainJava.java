package com.stg.main;
/**
 * @author bharathp
 *
 */

import com.stg.annotation.MyClass;
import com.stg.annotation.MyInterface;


public class OverrideMainJava {
	public static void main(String[] args) {
		MyInterface interface1 = new MyClass();
		interface1.display();
	}
}
