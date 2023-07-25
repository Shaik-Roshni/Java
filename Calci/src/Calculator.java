import java.util.Scanner;
public class Calculator {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the 2 numbers for addition");
	int a=scan.nextInt();
int b=scan.nextInt();

public static int add(int num1,int num2)
{
int res1=(num1+num2);
System.out.println("Addition result is:"+res1);
}
public static int sub(int num1,int num2)
{
int res2=(num1-num2);
System.out.println("Subtraction result is:"+res2);

}
public static int mul(int num1,int num2) {
	int res3=(num1*num2);
	System.out.println("Multiplication result is:"+res3);
}
public static int div(int num1,int num2) {
	int res4=(num1/num2);
	System.out.println("Division result is:"+res4);
}
public static int mod(int num1,int num2)
{
	int res5=(num1%num2);
	System.out.println("Remainder result is:"+res5);
}
public static int square(int num1,int num2)
{
	int res6=(num1^num2);
	System.out.println("Square result is:"+res6);
}
System.out.println(exit);


}
