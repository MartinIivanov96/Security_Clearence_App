package unidue.de;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("02"));
		EmployeeID employee1 = new EmployeeID("Martin", "Ivanov", new Adress(206, 47057, "Duisburg", "Kammerstrasse"), new Birthday(1996, Month.FEBRUARY, 27));

		EmployeeID employee2 = new EmployeeID("Dennis", "Potthaus", new Adress(45, 47055, "Duisburg", "Fuchsstrasse"), new Birthday(1999, Month.DEZEMBER, 25));

		SecuritySystem securitySystem = new SecuritySystem();
		securitySystem.addEmployee(employee1);
		securitySystem.addEmployee(employee2);
		Map<Integer, EmployeeID> variableMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("Main Menu:");
			System.out.println("1. add new employee");
			System.out.println("2. remove employee from security system by uid");
			System.out.println("3. is employee employed by uid");
			System.out.println("4. get employee by uid");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine();  // Consume newline left-over

			switch (choice) {
				case 1:
					System.out.println("add new employee");
					System.out.println("Enter first name :");
					String name = scanner.next();
					System.out.println("Enter Last Name: ");
					String nachname = scanner.next();
					System.out.println("Enter the birthday in format dd/mm/yyyy; ");
					String birthdate = scanner.next();
					String[] result = birthdate.split("/");
					int year = Integer.parseInt(result[2]);
					int month = Integer.parseInt(result[1]);
					int day = Integer.parseInt(result[0]);
					Birthday birthday = new Birthday(year, Month.fromMonthNumber(month), day);
					System.out.println("Please enter the street name:");
					String strasse = scanner.next();
					System.out.println("Please enter the house number:");
					int hausnummer = scanner.nextInt();
					System.out.println("Please enter the city name:");
					String stadt = scanner.next();
					System.out.println("Please enter the zip code:");
					int plz = scanner.nextInt();
					Adress adress = new Adress(hausnummer, plz, stadt, strasse);
					EmployeeID employee = new EmployeeID(name, nachname, adress, birthday);
					variableMap.put(employee.getUid(), employee);
					securitySystem.addEmployee(employee);
					break;
				case 2:
					System.out.println("enter uid to remove employee :");
					int uid = scanner.nextInt();
					securitySystem.removeEmployee(variableMap.get(uid));
					System.out.println("The employee " + variableMap.get(uid).getVorname() + " " + variableMap.get(uid).getNachname() + " has been removed from the system.");
					break;
				case 3:
					System.out.println("enter uid to check if the employee is employed :");
					uid = scanner.nextInt();
					if(securitySystem.isEmployed(securitySystem.getEmployeeByUid(uid)))
						System.out.println("Employee with uid "+uid+" is employed.");

					break;
				case 4:
					System.out.println("enter uid to find employee: ");
					uid = scanner.nextInt();
					System.out.println("employee with name " + securitySystem.getEmployeeByUid(uid).getVorname() + " "+ securitySystem.getEmployeeByUid(uid).getNachname());
					break;
				case 5:
					System.out.println("Exiting...");
					exit = true;
					break;
				default:
					System.out.println("Invalid option. Please try again.");
					break;
			}
		}

	}
}