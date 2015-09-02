package com.wbqa.pp;
import java.util.Scanner;


public class pingpong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		a = s.nextInt();
		if(a%3==0 && a%5==0)
			System.out.println("Ping Pong");
		else if(a%3==0)
			System.out.println("Ping");
		else if(a%5==0)
			System.out.println("Pong");
		else
			System.out.println(a);
	}

}
