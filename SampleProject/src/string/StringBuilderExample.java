package string;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str=" World";
		StringBuilder builder=new StringBuilder("hello ");
		
		System.out.println(builder.append(str));
		
		System.out.println(builder.insert(5, " hai"));
		
        System.out.println(builder.replace(5, 9, str));
        
        System.out.println(builder.substring(5));
        
        System.out.println(builder.reverse());
        
        System.out.println(builder.charAt(2));
        
        System.out.println(builder.capacity());
        
        System.out.println(builder.length());
        
        System.out.println(builder.substring(5, 11));
        
        System.out.println(builder.delete(0, 5));
	}

}
