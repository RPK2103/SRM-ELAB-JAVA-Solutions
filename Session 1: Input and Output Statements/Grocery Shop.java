import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class TestClass {
	 public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
		String product=sc.nextLine();
       	float price=sc.nextFloat();
        int i=sc.nextInt();
       	System.out.println("Product Details");
       	System.out.println(product);
       	System.out.println(price);
       	System.out.println(i);
       System.out.println("Bill:"+(price*i));
       
      
	}
}
