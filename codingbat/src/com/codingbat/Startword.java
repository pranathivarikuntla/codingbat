package com.codingbat;

public class Startword {
	public static  String startWord(String str, String word) 
	{
		int length=word.length();
		System.out.println(length);
		//System.out.println(word);
		String s1="";
		//System.out.println(s1);
		if( !str.substring(1,length).equals(word.substring(1)) )  
		//s1= str.substring(0,length);
			System.out.println("second string not found");
		else if( str.substring(0,length).equals(word)^ !str.substring(0,1).equals(word.substring(0,1)))
			s1= str.substring(0,length);
		return s1;
	}
	public static void main(String[] args) 
	{
		String str1="branathi";
	 String str2="vr";
		 System.out.println(startWord(str1,str2));
	}

}
