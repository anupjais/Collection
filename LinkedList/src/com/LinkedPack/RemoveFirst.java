package com.LinkedPack;
import java.util.LinkedList;
public class RemoveFirst
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		for(int i=10; i<100; i+=10)
			list.add(i);
		
		System.out.println(list);
		
//		for(LinkedList i: list)
		for(int i=0; i<list.size(); i++)
			System.out.println(list.removeFirst());
	}

}
