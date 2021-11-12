import java.util.*;

public class GuessNumber{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		Random rand = new Random();

		int number = rand.nextInt(6);

		System.out.println(number);
	}
}