import java.util.Scanner;

public class Order{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int y = obj.nextInt();

		if(x>y){
			System.out.println(y +" " + x);
		}
		else {
			System.out.println(x + " " + y);
		}
	}
}