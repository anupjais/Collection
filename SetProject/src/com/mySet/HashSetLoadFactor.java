package com.mySet;
import java.util.HashSet;
public class HashSetLoadFactor
{
	public static void main(String[] args)
	{
		HashSet hashSet = new HashSet();
		int cnt = 1;
//		for(HashSet i: hashSet)
//		{
//			System.out.println(cnt++);
//		}
		System.out.println(cnt++);
		for (Object object : hashSet)
		{
//			System.out.println(cnt++);
			System.out.println(object);
		}
		System.out.println(cnt++);
	}

}
