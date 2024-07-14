package com.LinkedPack;

import java.util.Scanner;

class GFG
{
    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GFG g = new GFG();
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" "+ g.factorial(i)/ (g.factorial(i - j)* g.factorial(j)));
            }
            System.out.println();
        }
    }
}