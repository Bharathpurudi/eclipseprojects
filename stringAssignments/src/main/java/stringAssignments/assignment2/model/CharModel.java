package stringAssignments.assignment2.model;

/**
 * @author bharathp
 *
 */

public class CharModel {
	private String string1;

	public CharModel(String string1) {
		super();
		this.string1 = string1;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}
	
	//public String duplicateCharecters(String string) {
		
	
	
	public static void main(String[] args) {
		CharModel charModel = new CharModel("Bharath");
	}
	

}
