import java.util.Scanner;
public class EntryPoint {
    public static void main (String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int choose ;
		 boolean con = true;
		 do{
		 System.out.println("Which service would you like to use?" +"\n"
		 			+ "[1]: Basic week visualizer" +"\n"
					+ "[2]: Advanced week visualizer" +"\n"
					+ "[3]: Basic calculator" +"\n"
		 			+ "[4]: Employee repertoire");
		 choose = scan.nextInt();
		 if(choose < 1 || choose > 4){
                System.out.println("Please make sure you pick a number between 1 and 4: ");
            }else{
		switch(choose){
			 case 1:
				BasicWeek week1 = new BasicWeek();
				week1.printDays();
				break;
			 case 2:
				AdvancedWeek week = new AdvancedWeek();
				week.printDays();
				break;
			 case 3:
				Calculator calc = new Calculator();
				break;
			 case 4:
				Employee employee = new Employee();
				System.out.println(employee);
				break;
			 
		 }
		}

		 System.out.println("Would you like to perform another operation? (y/n)");
		 scan.nextLine();
		 if(scan.nextLine().equals("y")){
			 con = true;
		 }else{
			 con = false;
		 }
		 }while(con);
		 
    }
}