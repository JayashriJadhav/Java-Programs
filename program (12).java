import java.util.*;

class Program149
{
	public static void main (String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		
		System.out.println("enter your name");
		str=sobj.nextLine();
		
		Marvellous mobj=new Marvellous();
		mobj.Display(str);
		
	}
}

class Marvellous
{
	public void Display(String Data)
	{
		System.out.println("welcome:"+Data);
	}
}