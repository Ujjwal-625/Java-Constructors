// Base class Employee
public class Employee {
    public int employeeID;       // public access modifier
    protected String department; // protected access modifier
    private double salary;       // private access modifier

    // Constructor to initialize Employee details
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to get the salary (private field)
    public double getSalary() {
        return salary;
    }

    // Method to modify the salary (public method)
    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    // Main method to test the Employee class and Manager subclass
    public static void main(String[] args) {
        // Creating an instance of Manager class
        Manager manager = new Manager(101, "Sales", 60000);

        // Accessing the employeeID (public)
        System.out.println("Employee ID: " + manager.employeeID);

        // Accessing the department (protected)
        System.out.println("Department: " + manager.department);

        // Accessing and modifying the salary (private, accessed via methods)
        System.out.println("Current Salary: " + manager.getSalary());
        manager.modifySalary(75000); // Modifying salary
        System.out.println("Updated Salary: " + manager.getSalary());

        // Displaying employee details
        manager.displayEmployeeDetails();
    }
}

// Subclass Manager that extends Employee
class Manager extends Employee {

    // Constructor to initialize Manager details, calling the parent class constructor
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Additional methods for Manager can be added here
}
