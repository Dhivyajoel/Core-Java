package test;

import java.util.Scanner;

public class EvenNumCheck {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number: ");
		
		int num = new Scanner(System.in).nextInt();
		
		if(num%2==0) {
			
			System.out.println("Even Number");
		}else {
			
			System.out.println("Odd Number");
		}

	}

}

