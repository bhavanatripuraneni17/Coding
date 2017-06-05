

import java.util.Scanner;

public class Palindrome{

    public static void main(String[] args) {

    	String str=new String();

    	String reverse="";
    	System.out.println("Enter the string ");

    	Scanner in=new Scanner(System.in);

    	str=in.nextLine();

    	int len=str.length();

    	for(int i=(len-1);i>=0;i--)
    	{

    		reverse+=str.charAt(i);

    	}

    	if (str.equals(reverse))
            
    		System.out.println("Entered string is a palindrome.");
    	
         else
            
        	 System.out.println("Entered string is not a palindrome.");
    

}
    }
