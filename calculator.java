import java.util.Scanner;

public class calculator {
	public static void main(String args[]){
		Scanner savage = new Scanner (System.in);
		double fnum, snum, answer;
		System.out.println("Enter First Number");
		fnum = savage.nextDouble();
		System.out.println("Enter Second Number");
		snum = savage.nextDouble();
		answer = fnum + snum;
		System.out.println("Your Answer is");
		System.out.println(answer);
	}
}
