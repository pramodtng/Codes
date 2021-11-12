import java.util.Scanner;

public class Loops{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int[] y = new int[x];
		for(int i=0;i<x;i++){
			y[i] = obj.nextInt();
		}

		for(int i=0;i<x;i++){
			System.out.println(y[i]);
		}
	}
}