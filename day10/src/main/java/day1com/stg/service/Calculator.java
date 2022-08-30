package day1com.stg.service;

import com.stg.exception.*;

public class Calculator {
	
	public int add (int num1, int num2) throws PossitiveNumException {
		int temp = 0;
		if(num1 > 0 && num2 >0) {
			temp= num1+num2;
		}else {
			throw new PossitiveNumException("No negative numbers will be entertained");
		}
		return temp;
	}
	
	public int div (int num1, int num2) {
		return num1/num2;
	}

}
