import java.util.*;

class Program140
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		int iNo1=0;
		int iNo2=0;
		int iAns=0;
		
	   System.out.println("Enter first number");
	   iNo1=sobj.nextInt();
	   
	   System.out.println("Enter second number");
	   iNo2=sobj.nextInt();
	   
	   Marvellous mobj=new Marvellous();
	   iAns=mobj.Addition(iNo1,iNo2);
	   
	   System.out.println("Addition is:"+iAns);
	   
	}
}
class Marvellous
{
	public int Addition(int i,int j)
	{
		int iResult=0;
		iResult=i+j;
		return iResult;
	}
}