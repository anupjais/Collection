package com.LinkedPack;
import java.util.LinkedList;
public class AddFirst
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		for(int i=2; i<=20; i+=2)
			list.addFirst(i);
		System.out.println(list);
	}

}
