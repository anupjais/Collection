package com.LinkedPack;

import java.util.Vector;

public class VectorCapacityCheck
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		for(int i=1; i<10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				v.addElement(i*j);
			}
			System.out.println(v);
			System.out.println("Capacity "+i+" : "+v.capacity());
		}
//		System.out.println(v);
	}

}
