package fmi.informatics.tests;

import fmi.informatics.extending.Student;

public class StudentTest {
	
	public static void getTypicalDrinkTest(Student student) {
		String typicalDrinkExpected = "Vodka";
		String typicalDrinkResult = student.getTypicalDrink();
		
		if (assertString(typicalDrinkResult, typicalDrinkExpected)) {
			System.out.println("Method getTypicalDrink() from class Student returns what is expected");
		} else {
			System.err.println(
					"Method getTypicalDrink() from class Student returns: " +
					typicalDrinkResult + ", but the expected result is: " +
					typicalDrinkExpected
			);
		}
	}
	
	public static boolean assertString(String result, String expectedResult) {
		return result.equals(expectedResult);
	}
}