package Instance;

public class ReverseThisInstance 
{
	int num;
	int rev;
	int digit;
	int number;

	public static void main(String[] args)
	{
		new ReverseThisInstance(1234);
		
		
	}
	public ReverseThisInstance(int number )
	{
		this();
		this.num=number;
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reverse of "+number+"\t  is \t"+rev);

	}
	public ReverseThisInstance()
	{
		
		System.out.println("Reverse of ");
	}

}
