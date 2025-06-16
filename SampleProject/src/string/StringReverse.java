package string;

public class StringReverse
{

	public static void main(String[] args)
	{
		String s="java";
		String s1="malayalam";
		StringBuilder builder =new StringBuilder(s);
		StringBuilder buil=new StringBuilder(s1);
		System.out.println("Reverse of "+s+ " is" +" "+ builder.reverse());
 		System.out.println("Reverse of "+s1+ " is" +" "+buil.reverse()); 
		if(s.equals(builder.toString()))
		{
			
			System.out.println(s+" is a palindrome String");
		}
		else
		{
			System.out.println(s+" is not a palindrome String");
		}
		
		if(s1.equals(buil.toString()))
		{
			
			System.out.println(s1+" is a palindrome String");
		}
		else
		{
			System.out.println(s1+" is not a palindrome String");
		}
		
	}
	
}
