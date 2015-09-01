package com.wbqa.pmex;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, prev, next, sum;
		prev=0;
		next=1;
		System.out.println(prev);
		System.out.println(next);
		for(n=0;n<10;n++)
		{	
			sum=prev+next;
			System.out.println(sum);
			prev=next;
			next=sum;
		}

	}

}
