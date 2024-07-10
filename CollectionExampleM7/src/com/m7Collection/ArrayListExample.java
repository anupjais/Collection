package com.m7Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListExample
{
	public static void main(String[] args)
	{
		Collection col = Arrays.asList(19,10,20,40);
		List<Integer> list = new ArrayList<>(col);

		System.out.println(list);
		list.set(2,30);
		System.out.println(list);
	}

}
