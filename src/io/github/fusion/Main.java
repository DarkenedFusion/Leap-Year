package io.github.fusion;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the leap year checker!");
		System.out.print("Please enter a year: ");

		int year = input.nextInt();	
		Boolean isLeap = false;
		
		System.out.println("You choose: " + year);
		
		if(year % 4 == 0) {
			if(year % 100 == 0 && year % 400 != 0) {
				System.out.print(isLeap);
				return;
			}
			isLeap = true;
			System.out.print(isLeap);
			return;
		}  else {
			System.out.print(isLeap);
			return;
		}
	}
}
