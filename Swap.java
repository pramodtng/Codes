import java.util.Scanner;

public class Swap{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int rev = 0;
		while(x > 0){
			int y = x%10;
			rev =rev * 10 + y;
			x /= 10;
		}
		System.out.println(rev);
	}
}