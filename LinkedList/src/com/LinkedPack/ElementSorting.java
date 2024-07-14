package com.LinkedPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementSorting
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		List list = new ArrayList();
		System.out.println("Enter 10 elements");
		for(int i=0; i<10; i++)
			list.add(sc.nextInt());
		
		System.out.println(list);
		list.forEach((ele1, ele2) ->  { return ele1 > ele2});
		System.out.println(list);
	}

}
