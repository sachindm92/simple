package simple;

import java.util.Scanner;

public class division {

	public static void main(String[] args) {
     int a,b,c;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter first number");
     a=sc.nextInt();
     System.out.println("Enter second number");
     b=sc.nextInt();
     c=a/b;
     System.out.println("division is "+c);

	}

}
