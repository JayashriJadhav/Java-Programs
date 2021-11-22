//using while

import java.util.*;

class Program152
{
	public static void main (String Arg[])
	{
		Marvellous mobj =new Marvellous();
		int iRet=0;
		
		mobj.Accept();
		mobj.Display();
		
		iRet=mobj.CountVowels();
		System.out.println("Number of vowels are:"+iRet);
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
	public int CountVowels()
	{
		char Arr[]= Str.toCharArray();
		int iCnt=0,i=0;
		
		while(i<Arr.length)
		{
			if((Arr[i]=='a')||(Arr[i]=='e')||(Arr[i]=='i')||(Arr[i]=='o')||(Arr[i]=='u'))
			{
				iCnt++;
			}
			i++;
	    }
		return iCnt;
	}
	
	
}
	