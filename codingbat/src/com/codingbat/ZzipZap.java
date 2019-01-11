package com.codingbat;

//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
//Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

public class ZzipZap {
	public static  String zipZap(String str) 
	{    String s1="";
	String s2="";
		for(int i=0;i<str.length();i=i+1) {
		 //s1=str.substring(i,i+3);
		// System.out.println(s1);
			if(i<=str.length()) {
	if(str.substring(i,i+1).contentEquals("z") && str.substring(i+2,i+3).equals("p")) 
	{
		 s2=str.substring(i,i+1).concat(str.substring(i+2,i+3));
		System.out.println(s2);
	}
		//s2=s2+str.substring(i+3,i+4);
			}
		}
		return s2;
	}
	public static void main(String[] args) 
	{
		String str="zipXzap";
		String str2="zopzop";
		String str3="zzzopzop";
				zipZap(str) ;// "zpXzp"
			//	zipZap(str2) ;// "zpzp"
				//zipZap(str3);//zzzpzp
	}

}
