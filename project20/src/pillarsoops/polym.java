package pillarsoops;
class Bank
{
	float getRateOfInterest()
	{
		return 0;
	}
}
class HDFC extends Bank
{
	float getRateOfInterest()
	{
		return 6.5f;
	}
}
class IDFC extends Bank
{
	float getRateOfInterest()
	{
		return 6.9f;
	}
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 4.8f;
	}
}

public class polym 
{
	public static void main(String args[])
	{
		Bank b;
		b=new HDFC();
		System.out.println("Hdfc Rate Of Interest:"+b.getRateOfInterest());
		b=new IDFC();
		System.out.println("Idfc Rate Of Interest:"+b.getRateOfInterest());
		b=new SBI();
		System.out.println("Sbi Rate Of Interest:"+b.getRateOfInterest());
	}

}
