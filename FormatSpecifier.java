import java.util.Scanner;

public class FormatSpecifier{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("What is your name? ");
		String str = obj.nextLine();

		//using format specifier
		System.out.format("Name: %s", str);

		System.out.println();

		//using println
		System.out.println("Name: " + str);
	}
}