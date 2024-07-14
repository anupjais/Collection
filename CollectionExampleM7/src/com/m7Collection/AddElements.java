package com.m7Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AddElements
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		for(int i=0; i<5; i++)
		{
			String str = sc.next();
			list.add(str);
		}
		
//		for(E i: list)
//		{
//			System.out.print(i+" ");
//		}
		System.out.println(list);
	}
}
