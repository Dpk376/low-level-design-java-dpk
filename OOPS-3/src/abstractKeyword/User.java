package abstractKeyword;

/**
 * Abstract class representing a system user.
 */
public abstract class User {

    /**
     * The name of the user. Protected to allow subclass access.
     */
    protected String name;

    /**
     * Constructs a new User.
     *
     * @param name the name of the user
     */
    public User(String name) {
        this.name = name;
        System.out.println("User constructor is called");
    }
}
