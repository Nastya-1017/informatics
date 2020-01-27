package fmi.informatics.extending;

import fmi.informatics.composition.RichStudent2;
import fmi.informatics.interfaces.Adaptable;

import java.util.ArrayList;

public class PersonList {
    ArrayList<Person> people = new ArrayList<>();

    public void runTest() {
    loadPeople();
    showStats(people);
    PersonUnitTest.getListSizeTest(people);
        Adaptable adaptable = new Adaptable() {
            @Override
            public void study() {
                System.out.println("Studying");
            }

            @Override
            public void think() {
                System.out.println("Thinking");
            }

            @Override
            public void act() {
                System.out.println("Acting");
            }
        };
        adaptable.study();
    }

    private void showStats(ArrayList<Person> people) {
        int studentCounter = 0;
        int professorCounter = 0;
        int richStudentCounter = 0;

        for (Person person : people) {
            if (person instanceof RichStudent2) {
            richStudentCounter++;
            study(person);
            }
            else if (person instanceof Student) {
                studentCounter++;
                study(person);
            }

            if (person instanceof Professor) {
                professorCounter++;
            }


        }
        System.out.println("Number of students " + studentCounter);
        System.out.println("Number of professors " + professorCounter);
        System.out.println("Number of richStudents " + richStudentCounter);
        System.out.println("Total number of people " + people.size());
    }

    public void study(Person person){
        System.out.printf("%s is am studying\n", person.getName());
    }

    private void loadPeople() {
        Person person1 = new Student("Pesho", 123, "PU", "5698", 2569) ;
        Person person2 = new Professor("Docent", "Aleks", true, 54, 55, 2569);
        Person person3 = new Professor("profesor", "Tolstoi", false, 522, 5, 1);
        Person person4 = new RichStudent2("Maximiliyan", 8666, "PU", "5698", 2569);
        Person person5 = new Student("Tosho", 12773, "PU", "5698", 2569) ;
        Person person6 = new Student("Leopold", 888, "PU", "5698", 2569) ;
        Person person7 = new RichStudent2("todor", 8666, "PU", "5698", 2569);
        Person person8 = new RichStudent2("todor", 8666, "PU", "5698", 2569);


        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
    }
}
