package com.myIteratorPack;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		for(int i=1; i<11; i++)
			list.add(i);
		
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext())
		{
			if(itr.next()%2==0)
				itr.remove();
		}
		System.out.println(list);
	}
}
