import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);
	System.out.println("Please input the employee's first name: ");
	firstName = scan.nextLine();
	System.out.println("Please input the employee's last name: ");
	lastName = scan.nextLine();
	System.out.println("Please input the employee's age: ");
	age = scan.nextInt();
	System.out.println("Please input the employee's salary: ");
	salary = scan.nextDouble();
	
       

    }

    public String toString() {
        String output = "Employee information:" + firstName + " " + lastName + ", " + age + ", " + salary ;
	return output;
    }
}