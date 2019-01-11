package com.codingbat;

public class OneTwo {
	public  static String oneTwo(String str)
	{
		 String st=str.substring(1,str.length()).concat(str.substring(0,1));
		 return st;
	}
	public static void main(String[] args) 
	{
		String str="pranathi";
		System.out.println(oneTwo(str));
	}

}
