package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n, count=0;
    System.out.println("Enter a no=");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count ++;
            }
        }
        if(count==2)
            System.out.println("No is prime");
        else
            System.out.println("No is not prime");
    }
}
