package test;

import java.util.Scanner;

public class Main {

	public static void main(String a[]){
		int input1;
		String input2;	
		System.out.println("Enter the series of wickets");
		Scanner sc = new Scanner(System.in);
	     input2 = sc.next();  
	     String []value  = input2.split(",");
	      input1 = value.length;
	      BestBowler b = new BestBowler(input1,input2);
	      int g = b.bestBowler();
	      System.out.println("BEst Bowlers = "+g);
	}
}
