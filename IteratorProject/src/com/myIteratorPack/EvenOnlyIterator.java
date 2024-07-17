package com.myIteratorPack;
import java.util.ArrayList;
import java.util.Iterator;

public class EvenOnlyIterator
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		for(int i=1; i<=10; i++)
			list.add(i);
		
		System.out.println("Elements are : "+list);
		
//		Converted the list into the Iterator
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext())
		{
			if(itr.next() % 2 != 0)
				itr.remove();
		}
		System.out.println("Even elemets are : "+list);
	}
}
