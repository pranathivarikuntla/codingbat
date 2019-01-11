package com.codingbat;

public class withoutX {
	public static void main(String[] args)
	{
		String str="xvfhgfxhg";
	    System.out.println(withoutX(str));	
	}
	public  static String withoutX(String str) 
	{
		String s1=str.substring(0, 1);
	
		System.out.println(s1);
		String s2=str.substring(str.length()-1, str.length());
		System.out.println(s2);
		String s3="";
		if((s1.contentEquals("x") && s2.contentEquals("x"))) {
			System.out.println(str.substring(1,str.length()-1));
		}
		else if((s1.contentEquals("x") && !s2.equals("x")))
			System.out.println(str.substring(1,str.length()));
		else if(!s1.equals("x") && s2.equals("x"))
			System.out.println(str.substring(0,str.length()-1));
	    System.out.println(s3);
		return s3;
		
	}

}
