package wsc.practice01;
import java.util.*;
  public class Change {
  public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("请输入a=");
	int a	=input.nextInt();
	System.out.print("请输入b=");
	int b=input.nextInt();
	System.out.println("**************************");
	System.out.println("交换前a="+a);
    System.out.println("交换前b="+b);	
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("**************************");
	System.out.println("交换后a="+a);
    System.out.println("交换后b="+b);	
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
