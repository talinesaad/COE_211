import java.util.*;
	public class EntryPoint {
		public static void main(String [] args){

			Random rnd = new Random();
			int answer = rnd.nextInt(10) +1;
			
			for ( int i=1; i< answer; i++){
			System.out.println("You have " + (answer-i) + "insertions left.");
			

			Scanner scan = new Scanner(System.in);
			System.out.println("Please input the employee's first name:");
			String firstName = scan.nextLine();

			System.out.println("Please input the employee's last name:");
			String lastName = scan.nextLine();
			
			System.out.println("Please input the employee's age");
			int age = scan.nextInt();


			System.out.println("Please input the employee's monthly salary");
			Double monthlySalary = scan.nextDouble();
			
			Employee person1 = new Employee(firstName,lastName,age,monthlySalary);
			System.out.println("Employee information: " + person1.FirstName + " " + person1.LastName + ", " + person1.Age + ", " + person1.MonthlySalary);

			


 
	


		}
	}
}