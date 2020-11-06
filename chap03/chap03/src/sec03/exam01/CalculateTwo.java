package sec03.exam01;

import java.util.Scanner;

public class CalculateTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("First Num :");
		double num1 = Double.parseDouble(scanner.nextLine());
		System.out.print("Second Num :");
		double num2 = Double.parseDouble(scanner.nextLine());
		System.out.println("-------------");
		String result = (num2 ==0)? "무한":Double.toString(num1/num2);
		System.out.println(result);
		
	}

}
