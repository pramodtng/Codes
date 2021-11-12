import java.util.Scanner;

public class AvgSum{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int sums = 0;
		double avg = 0;
		int nums[] = new int[x];
		for(int i=0;i<x;i++){
			nums[i] = obj.nextInt();
		}
		for(int i=0;i<x;i++){
			sums += nums[i];
		}
		avg = (double)sums/x;
		System.out.println(avg);
	}
}