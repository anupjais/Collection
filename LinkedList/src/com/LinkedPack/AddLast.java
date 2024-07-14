package com.LinkedPack;
import java.util.LinkedList;
public class AddLast
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		for(int i=3; i<=30; i+=3)
			list.addLast(i);
		System.out.println(list);
	}

}
