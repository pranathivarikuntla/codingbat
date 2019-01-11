package com.codingbat;

public class WithoutX2 {
	public static String withoutX2(String str) 
	{
		int findex=0,lindex=0;
		String s2="";
		String s1=str.substring(0,2);
		if(str.substring(0,2).equalsIgnoreCase("xx"))
		     s2=str.substring(2);
		 
		else if(str.substring(0,1).equals("x")) {
	       s2=str.substring(1);
		}
		else if(str.substring(1,2).equals("x"))
			s2=str.substring(0,1).concat(str.substring(2));
		 
		else
			s2=str;
	return s2;
	}
	public static void main(String[] args) 
	{
		//String str="xhx";//return hx
		String str2="xhi";//return hi
		//System.out.println(withoutX2(str));
		System.out.println(withoutX2(str2));
		
	}
	/*
	 * if(s1.contentEquals("xx")) s2=str.substring(2); else if(s1.contains("x")) {
	 * findex=s1.indexOf('x'); System.out.println(findex); if(findex==0)
	 * s2=str.substring(1); if(findex==1)
	 * s2=str.substring(0,1).concat(str.substring(2)); }else s2=str;
	 */

}
