import java.util.StringJoiner;


public class Java8StringJoiner {

	public static void main(String[] args) {
		  StringJoiner mystring = new StringJoiner("-");    
          
	        // Joining multiple strings by using add() method  
	        mystring.add("Logan");  
	        mystring.add("Magneto");  
	        mystring.add("Rogue");  
	        mystring.add("Storm");  
	                  
	        // Displaying the output String
	        System.out.println(mystring);  
	        
	        
	        /* Passing comma(,) as delimiter and opening bracket
	    	 * "(" as prefix and closing bracket ")" as suffix
	    	 */
	        StringJoiner mystring1 = new StringJoiner(",", "(", ")");    
	          
	        // Joining multiple strings by using add() method  
	        mystring1.add("Negan");  
	        mystring1.add("Rick");  
	        mystring1.add("Maggie");  
	        mystring1.add("Daryl");  
	                  
	        // Displaying the output String
	        System.out.println(mystring1);  

	}

}
