package simple;

import java.util.Scanner;

public class revstr {

	public static void main(String[] args) {
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:-");
	str=sc.nextLine();
	char[]ch=str.toCharArray();
	int j=ch.length;
	for(int i=j;i>0;i--)
	{
		System.out.print(ch[i-1]);
	}

	}

}
