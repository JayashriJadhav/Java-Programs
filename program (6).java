import java.util.*;

class Program142
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		int iValue=0;
		boolean bRet=false;
		
		System.out.println("enter number");
		iValue=sobj.nextInt();
		
		Marvellous mobj=new Marvellous();
		
		bRet=mobj.CheckArmstrong(iValue);
		
		if(bRet==true)
		{
			System.out.println("it is Armstrong number");
		}
		else
		{
			System.out.println("it is  not Armstrong number");
		}
	  
	}
}
class Marvellous
{
	public boolean CheckArmstrong(int iNo)
	{
		int iTemp=0;
		int iDigCnt=0;
		int iDigit=0;
		int iPower=1;
		int iCnt=0,iSum=0;
		if(iNo<0)
		{
			iNo=-iNo;
		}
		iTemp=iNo;
		
		while(iTemp!=0)    //for digit count
		{
			iDigCnt++;      //3
			iTemp=iTemp/10;
		}
		
		iTemp=iNo;
		
		while(iTemp!=0)
		{
			iDigit=iTemp%10;      
			for(iCnt=1;iCnt<=iDigCnt;iCnt++)
			{
				iPower=iPower*iDigit;
			}
			iSum=iSum+iPower;
			iPower=1;
			iTemp=iTemp/10;
		}
		if(iSum==iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	 }	
}