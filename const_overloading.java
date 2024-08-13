package avishkar_programs;
import java.io.*;
import java.util.*;
class over
{
	int id;
	String name;
	int age;
	over(int id1,String n1,int a1)
	{
		id=id1;
		name=n1;
		age=a1;
	}
	over(int id1,String n1)
	{
		id=id1;
		name=n1;
	}
	void displ()
	{
	System.out.println(id+""+name+""+age+"");
	}
}
public class const_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int id;
          String name;
          int age;
          Scanner std=new Scanner(System.in);
          id=std.nextInt();
          name=std.next();
          age=std.nextInt();
          over o1= new over(id, name, age);
       over o2=new over(id, name);
       o1.displ();
       o1.displ();
	}

}
