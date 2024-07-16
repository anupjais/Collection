package com.MyVectorPack;
import java.util.ArrayList;
import java.util.Vector;
public class VectorCollectionCapacity
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add("Anup");
		list.add(47);
		
		Vector v = new Vector(list);
		System.out.println(v.capacity());
		System.out.println(v);
		
		for(int i=0; i<10; i++)
			list.add(i);
		System.out.println(v.capacity());
		System.out.println(v);
		
		v = new Vector(list);
		System.out.println(v);
		System.out.println(v.capacity());
		
		list.add("Shubham");
//		list.add("QSP");
		
		v = new Vector(list);
		System.out.println(v);
		System.out.println(v.capacity());
	}

}
