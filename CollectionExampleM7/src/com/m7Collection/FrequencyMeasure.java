package com.m7Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FrequencyMeasure
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,1,2,1,3};
		System.out.println("ArrayList : "+Arrays.toString(arr));
		
		List<Integer> list = new ArrayList<>();
		for(Integer i:arr)
			list.add(i);
		System.out.println("List : "+list);
		
		Set<Integer> set = new LinkedHashSet<>(list);
		int max = Integer.MAX_VALUE;
		Integer max1 = null;
		for(Integer i:set)
		{
			if(Collections.frequency(list, i)<max)
			{
				max = Collections.frequency(list, i);
				max1=i;
			}
		}
		System.out.println("Max1 : "+max1);
	}

}
