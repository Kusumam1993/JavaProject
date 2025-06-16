package string;

public class StringBufferExample
{

	public static void main(String[] args) 
	{
		StringBuffer buff=new StringBuffer("Hello ");//creating a string buffer object
		//append to join 2 strings
		buff.append("world");
		System.out.println("Combine two words:"+buff);
		//insert to join one word
		buff.insert(6, "hai ");
		System.out.println("Insert word:" +buff);
		//replace
		buff.replace(6,9 ,"super");
		System.out.println("replace string:"+buff);
		//delete
		buff.delete(0,5);
		System.out.println("Delete one word:"+buff);
		//reverse
		//buff.reverse();
		//System.out.println("Reverse the string:"+buff);
		//capacity
	    System.out.println(buff.capacity());//how much space allocated internally
		System.out.println(buff.length());//string length
		

	}

}
