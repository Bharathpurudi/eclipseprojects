package com.stg.main;

import com.stg.model.EmployeeAddress;
import com.stg.model.EmployeeModel;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeModel employeeModel = new EmployeeModel(1540, "Bharath", 25);
		EmployeeModel employeeMode2 = new EmployeeModel(1541, "Bittu", 25);
		EmployeeModel employeeMode3 = new EmployeeModel(1542, "Chinna", 25);
		EmployeeAddress employeeAddress1 = new EmployeeAddress(15, "Sri Chowdeshwari Street", "Rayadurg", "A.P", 515865);
		EmployeeAddress employeeAddress2 = new EmployeeAddress(16, "Sri Chowdeshwari Street", "Chennai", "T.N", 515867);
		EmployeeAddress employeeAddress3 = new EmployeeAddress(17, "Sri Chowdeshwari Street", "Bengaluru", "KA", 515868);
		EmployeeAddress[] empAddresses = new EmployeeAddress[3];
		empAddresses[0]= employeeAddress1;
		empAddresses[1]= employeeAddress2;
		empAddresses[2]= employeeAddress3;
		
		
	}

}
