import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc= new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();
       if(x>=0 && y>=0 && x<=200 && y<=100)
         System.out.println("The point is in the triangle");
       else
         System.out.println("The point is not in the triangle");
	}
}
