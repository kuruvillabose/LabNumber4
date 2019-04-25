import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		System.out.println("Learn your squares and cubes!");
		System.out.println(" ");
		String prompt;
		Scanner scan = new Scanner(System.in);
		do {

			System.out.println("Enter an Integer:");
			
			//Data validation
			while (scan.hasNextInt() == false) {
				scan.next();
				System.out.println("please enter a valid number" + "");
			}
			int num = scan.nextInt();
			System.out.println("Number     Squared      Cubed");
			System.out.println("======     =======      ======");
			for (int i = 1; i <= num; i++) {
				System.out.println(i + "              " + (i * i) + "         " + (int) Math.pow(i, 3));
			}

			System.out.println("Continue?(y/n):");

			prompt = scan.next();

		} while (prompt.equalsIgnoreCase("Y"));
		scan.close();
		System.out.println("Good bye");
	}

}
