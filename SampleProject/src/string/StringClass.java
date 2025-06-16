package string;

public class StringClass {

	public static void main(String[] args) {
		String s="java Programming";
		//length() 
	 System.out.println("Length:" +s.length());
	 System.out.println("Character: "+s.charAt(5));
	 //valueOf
	 int value=12;	
	 String str=String.valueOf(value);
	 System.out.println("Value Of number:" +str);
	 //equals
	 String s1="Java Programming";
	 System.out.println("Compares:"+s1.equals(s));
	 //equalsignorecase
	 System.out.println("equalsignorecase:"+s1.equalsIgnoreCase(s));
	 //Isempty
	 String none="hello ";
	 System.out.println("Is Empty:"+none.isEmpty());
	 //concat
	 System.out.println("Combing two words:"+s.concat(none));
	 //uppercase
	 System.out.println("CapitalLetter:"+s1.toUpperCase());
	 //Lowercase
	 System.out.println("Small Letters:"+s1.toLowerCase());
	 //Contains
	 System.out.println("contains any character:"+s1.contains(none));
	 //replace
	 System.out.println("Replace the character:"+none.replace('l','e'));
	}

}
