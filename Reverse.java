

import java.util.Scanner;

public class Reverse{

    public static void main(String[] args) {

    	String str=new String();

    	String reverse="";
    	System.out.println("Enter the string to be reversed");

    	Scanner in=new Scanner(System.in);

    	str=in.nextLine();

    	int len=str.length();

    	for(int i=(len-1);i>=0;i--)
    	{

    		reverse+=str.charAt(i);

    	}

    	System.out.println(reverse);

}
    }
