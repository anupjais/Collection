package com.m7Collection;

import java.util.Arrays;

public class DistinctEle
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,5,3,1,2,1,4,0,1,2};
		System.out.println(Arrays.toString(arr));
		Arrays.stream(arr).distinct().forEach(ele->System.out.print(ele+" "));
	}

}
