package sec03.exam04;

import java.util.Scanner;

public class StampStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int h=Integer.parseInt(scanner.nextLine());
		for(int i=1;i<=h;i++) {
			for(int j=h;j>i;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
