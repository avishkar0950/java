package avishkar_programs;
import java.io.*;
import java.util.*;

public class string_tokenizwer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer str=new StringTokenizer("shree$computer$eduaction","$");
		System.out.println(str.countTokens());
		while(str.hasMoreTokens())
		{
			System.out.println("next token is"+str.nextToken());
		}
		
	}

}
