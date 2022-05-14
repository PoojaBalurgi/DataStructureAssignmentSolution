package com.gl.skyscrapper.solution;

import java.util.Scanner;

public class MySkyscrapper {
	int n, arr[], i, temp,j,k;
	Scanner sc= new Scanner(System.in);
	public void ConstructSkyscrapper()
	{
		temp=n;
			for(i=0;i<n;i++)
			{	
				System.out.println("Day: "+(i+1));
				if(temp==arr[i])
				{
					System.out.print(temp+" ");
					temp--;
				
					outer:for(k=temp;k>0;k--)
					{
						for(j=i;j>=0;j--)
						{
							if(arr[j]==temp)
							{
								System.out.print(temp+" ");
								temp--;
								continue outer;
							}
						}
					
					}
				}
				System.out.println();
			}
		
	
	}
	
	public void input()
	{
		System.out.println("enter the total no of floors in the building : ");
		n=sc.nextInt();
		
		arr=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter the floor size given on day : "+(i+1));
			arr[i]=sc.nextInt();
		}
		
	}
	
	public static void main(String[] args) {
		MySkyscrapper obj= new MySkyscrapper();
		obj.input();
		obj.ConstructSkyscrapper();
	}
}
