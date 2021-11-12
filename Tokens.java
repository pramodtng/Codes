import java.util.Scanner;

public class Tokens{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the total amount: ");
		float totalAmount = obj.nextFloat();
		System.out.println("Enter the total number of people: ");
		int totalPeople = obj.nextInt();

		float bill = totalAmount/totalPeople;
		System.out.format("%.2f", bill);
	}
}