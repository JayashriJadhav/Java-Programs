import java.util.*;

class Program143
{
	public static void main (String Arg[])
	{
		Scanner Sobj=new Scanner(System.in);
		int iSize=0, iCnt=0;
		
		System.out.println("Enter number of elements");
		iSize=Sobj.nextInt();
		
		int Arr[]=new int[iSize];
		
		System.out.println("Enter numbers");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=Sobj.nextInt();
		}
		
		System.out.println("Entered elements are");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
		
		
	}
	
}