import java.util.*;

class Program156
{
	public static void main (String Arg[])
	{
		Marvellous mobj =new Marvellous();
		mobj.Accept();
		mobj.Display();
		boolean bRet;
		bRet=mobj.CheckPalindrome();
		if(bRet==true)
		{
		 System.out.println("string is palindrome");
		}
		else
		{
		 System.out.println("string is not palindrome");
		}
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
	public boolean CheckPalindrome()
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
	  String newstr=new String(Arr);
	  boolean bRet=newstr.equals(Str);
	  return bRet;
	}
	
}
	