package javacodes;

import java.util.Scanner;

public class NumberPatt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row_size;
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the row size:");
		row_size = sc.nextInt();
		int i, j, count=1;
		for(i= 1; i<=row_size; i++)
		
		{
			for(j= 1; j<=i; j++)
			{
			System.out.println(count);
		count++;
		}
		System.out.println();
		}
	}

}