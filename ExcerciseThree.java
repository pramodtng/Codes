import java.util.Scanner;

public class ExcerciseThree{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int y = obj.nextInt();

		//Conditiona Statements.
		if(x>y){
			System.out.println("X is greater");
		}
		else if(y<x){
			System.out.println("Y is greater");
		}
		else{
			System.out.println("Both are equal");
		}

		//Check the difference.
		if(x>y){
			System.out.println("X is greater" + (x-y));
		}
		else if(y<x){
			System.out.println("Y is greater" + (y-x));
		}
		else{
			System.out.println("Both are equal");
		}
	}
}