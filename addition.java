import java.util.Scanner;
class addition
{
 public static void main(String[] args)
{
int a,b;
System.out.println("enter the value of a");
Scanner std=new Scanner(System.in);
a=std.nextInt();
System.out.println("enter the value of b");
b=std.nextInt();
System.out.println("addition of a&b  " +(a+b));
System.out.println("substraction of a&b " +(a-b));
System.out.println("multiplication of a&b " +(a*b));
System.out.println("division of a&b " +(a/b));
System.out.println("modulus of a&b " +(a%b));
}
}
