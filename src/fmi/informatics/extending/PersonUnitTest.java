package fmi.informatics.extending;

import java.util.ArrayList;

public class PersonUnitTest {
    public static void getListSizeTest(ArrayList<Person> people) {
        int expectedNumOfPeople = 8;
        int numOfPeopleResults = people.size();

        if (assertIntegers(expectedNumOfPeople, numOfPeopleResults)) {
            System.out.println("People in the list are as to be expected "+ people.size());
        } else {
            System.err.printf("The expectations were not matched \n" +
                    "Expected number of people %d\n" +
                    "Number of people in the list %d\n ",expectedNumOfPeople,numOfPeopleResults);
        }
    }

    private static boolean assertIntegers(int result, int expectedResult) {
        return result==expectedResult;
    }
}
