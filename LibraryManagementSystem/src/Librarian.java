class Librarian extends User {
    private String employeeNumber;

    // Constructors
    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book) {
        // Implementation for adding a book
    }

    public void removeBook(Book book) {
        // Implementation for removing a book
    }
}