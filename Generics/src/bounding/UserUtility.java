package bounding;

import java.util.List;

public class UserUtility<T> {

    T val;

    public void printName(User u) {
        System.out.println(u.getName());
    }

//    public static void printNames(List<? extends User> users) {
//        for(User u: users) {
//            System.out.println(u.getName());
//        }
//    }

    /**
     * Prints the names of users from a list with an upper bound.
     * This follows the PECS (Producer Extends, Consumer Super) principle.
     * Use {@code ? extends T} or {@code <X extends T>} when you only need to read elements from the collection (Producer).
     *
     * @param users the list of users to print
     * @param <X>   the type of User
     */
    public static <X extends User> void printNames(List<X> users) {
        for(User u: users) {
            System.out.println(u.getName());
        }
    }

    /**
     * A method demonstrating a lower bound.
     * This follows the PECS (Producer Extends, Consumer Super) principle.
     * Use {@code ? super T} when you need to insert elements into the collection (Consumer).
     *
     * @param users the list that can accept User or its supertypes
     */
    public static void printNamesX(List<? super User> users) {

    }
}
