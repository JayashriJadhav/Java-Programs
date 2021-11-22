import java.util.*;

class Program153
{
	public static void main (String Arg[])
	{
		Marvellous mobj =new Marvellous();
		mobj.Accept();
		mobj.Display();
		String s=mobj.ReverseX();
		System.out.println("reverse string is:"+s);
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

class Marvellous extends StringX
{
	public String ReverseX()
	{
	  char Arr[]=Str.toCharArray();
      int istart=0,iEnd=Arr.length-1;	  
	  char temp;
	  
	  while(istart<iEnd)
	  {
		temp=Arr[istart];
        Arr[istart]	=Arr[iEnd];
		Arr[iEnd]=temp;
		istart++;
		iEnd--;
	  }
	  return new String(Arr); //method 1 to convert char array into string
	}
	
}
	