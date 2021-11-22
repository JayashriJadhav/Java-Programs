import java.util.*;

class Program150
{
	public static void main (String Arg[])
	{
		StringX sobj=new StringX();
		sobj.Accept();
		sobj.Display();
		
	}
}

class StringX
{
	public String Str;
	
	public void Accept()
	{
	 Scanner sobj=new Scanner(System.in);
     System.out.println("enter string");
     Str=sobj.nextLine();	 
	}
	
	public void Display()
	{
		System.out.println("String is:"+Str);
	}
}