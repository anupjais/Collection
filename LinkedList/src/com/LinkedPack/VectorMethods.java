package com.LinkedPack;
import java.util.*;
public class VectorMethods
{
	public static void main(String[] args)
	{
		Vector vector = new Vector();
		System.out.println("Intial Capacity : "+vector.capacity());
		for(int i=2; i<=20; i+=2)
			vector.addElement(i);
		
		System.out.println("The Elements : "+vector);
		System.out.println("The capacity : "+vector.capacity());
		System.out.println("Last element : "+vector.lastElement());
		System.out.println("First element : "+vector.firstElement());
		
		vector.setElementAt("\"E\"",2);
		System.out.println("After the seted : "+vector);
		
		vector.insertElementAt('a',5);
		System.out.println("The new list : "+vector);
		System.out.println("Updated Capacity : "+vector.capacity());
		
		
	}

}
