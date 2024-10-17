package talentnext;
import java.util.Scanner;
import java.util.scanner;
public interface Excercise {
	public static void main(String[] args) {
		Scanner in = new Scanner(Scanner.in);
		System.out.println("input for first number");
		int num1 = in.nextInt();
		System.out.println("input for second number");
		int num2 = in.nextInt();
		System.out.println("input for third number");
		int num3 = in.nextInt();
		if(num1>num2)
			if(num1>num3)
				System.out.println("the greatest number is " +num1);
		if(num2>num1)
			if(num2>num3)
				System.out.println("the greatest number is " +num2);
		if(num3>num2)
			if(num3>num1)
				System.out.println("the greatest number is " +num3);
		
	}

}
