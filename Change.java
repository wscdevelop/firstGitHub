package wsc.practice01;
import java.util.*;
  public class Change {
  public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("������a=");
	int a	=input.nextInt();
	System.out.print("������b=");
	int b=input.nextInt();
	System.out.println("**************************");
	System.out.println("����ǰa="+a);
    System.out.println("����ǰb="+b);	
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("**************************");
	System.out.println("������a="+a);
    System.out.println("������b="+b);	
  }	
//	int a=8;
//	int b=9;
//	int Change;
//	Change=a;
//	a=b;
//	b=Change;
//	System.out.println("a="+a);
//	System.out.println("b="+b);
//}
}
