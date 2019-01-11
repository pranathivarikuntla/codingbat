package com.codingbat;

public class SameStar {
	public  static boolean sameStarChar(String str)
	{ char ch=' '; String s1="";String s2="";
	boolean flag=false;
		
		for(int i=0;i<str.length();i++) 
		{
			 ch=str.charAt(i);
			 if(i>=1)  {
				 if(ch=='*') {
					 s1= str.substring(i-1,i);
					 s2=str.substring(i+1,i+2);

					  System.out.println(s1); System.out.println(s2);
				// str.substring(i-1,i).equals(str.substring(i+1,i+2));
					 if(s1.equals(s2)) {
					System.out.println("* found");
					flag=true;
					 }
					 else  if(!s1.contentEquals(s2)){
						 System.out.println("* not found");
						 return flag;
					 }
				
				 }
			 }
		}
		return flag;
		
	}
	public static void main(String[] args) 
	{
		String str="*xc*cb";
		String str2="*mc*cbg*m";
		//System.out.println(sameStarChar(str));
		System.out.println(sameStarChar(str2));
		
	}

}
