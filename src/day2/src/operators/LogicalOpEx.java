package operators;

public class LogicalOpEx {

	public static void main(String[] args) {
		  char ch = 'p'; // Character to check
	        
	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	        {
	            System.out.println(ch + " is a vowel.");
	        } 
	        else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
	        {
	            System.out.println(ch + " is a vowel.");
	        } 
	        else 
	        {
	            System.out.println(ch + " is not a vowel.");
	        }

	}

}
