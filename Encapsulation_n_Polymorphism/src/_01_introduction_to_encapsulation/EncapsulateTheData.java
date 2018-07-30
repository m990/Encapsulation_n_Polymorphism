package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	int itemsReceived; //must not be negative. All negative arguments get set to 0.
	float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	public void setItemsRecived(int items) {
		if (items < 0) {
			itemsReceived = 0;
		}
		else {
			itemsReceived = items;
		}
	}
	void setDegreesTurned(float degrees) {
		if (degrees < 0 || degrees > 360) {
			degreesTurned = 0;
		}
		else {
			degreesTurned = degrees;
		}
	}
	void setNomenclature(String nc) {
		if (nc.isEmpty()) {
			nomenclature = " ";
		}
		else {
			nomenclature = nc;
		}
	}
	void memberObj(Object o) {
		if (o instanceof String) {
			memberObj = (Object)o;
		}
		else {
			memberObj = o;
		}
	}
	@Test
	public void itemsRecievedTest() {
		setItemsRecived(10);
		assertEquals(10, itemsReceived);
		setItemsRecived(-10);
		assertEquals(0, itemsReceived);
	}
	
	@Test
	public void degreesTurnedTest() {
		setDegreesTurned(90);
		assertEquals(90, degreesTurned);
		setDegreesTurned(-10);
		assertEquals(0, degreesTurned);
		setDegreesTurned(370);
		assertEquals(0, degreesTurned);
	}
	
	@Test
	public void NomenclatureTest() {
		setNomenclature("methanic");
		assertEquals("methanic", nomenclature);
		setNomenclature("");
		assertEquals(" ", nomenclature);
	}
	
	@Test
	public void setMemberObject() {
		memberObj(10);
		assertEquals(10, memberObj);
		memberObj("This is a string");
		assertEquals(memberObj instanceof Object, (Object)memberObj instanceof Object);
	}
}
