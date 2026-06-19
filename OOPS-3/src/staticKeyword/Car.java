package staticKeyword;

/**
 * Class representing a Car to demonstrate the static keyword.
 */
public class Car {

    private String model;
    private static int count = 0;

    /**
     * Constructs a new Car with the specified model.
     *
     * @param model the model of the car
     */
    public Car(String model) {
        this.model = model;
        count++;
    }

    /**
     * A static method demonstrating class-level behavior.
     */
    public static void fun1() {
        System.out.println("I belong to the Class");
    }

    /**
     * Gets the total count of Car objects created.
     *
     * @return the total count of cars
     */
    public static int getCount() {
        return count;
    }

    /**
     * Gets the model of the car.
     *
     * @return the car model
     */
    public String getModel() {
        return model;
    }
}
