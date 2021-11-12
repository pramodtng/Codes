import java.util.Scanner;

public class Conditional{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int age = obj.nextInt();
		String check = obj.nextLine();
		if(age < 13 && check.equals("no")){
			System.out.println("You're in");
		}
		else{
			System.out.println("Check again");
		}
	}
}