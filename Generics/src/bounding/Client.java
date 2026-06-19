package bounding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Client {

    public static void main(String[] args) {
//        User u1 = new User("Virat");
//        UserUtility userUtility = new UserUtility();
//
//        userUtility.printName(u1);
//
//        Student s2 = new Student();
//        s2.setName("Rohit");

        UserUtility userUtility = new UserUtility();

        List<User> users = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        userUtility.printNames(students);

        List<Objects> objects = new ArrayList<>();
        UserUtility.printNamesX(Collections.singletonList(objects));

        Calculator<Integer> c = new Calculator<>();
        c.add(4,5);

        Calculator<String> c1 = new Calculator<>();
        c.add(4,5);



    }
}
