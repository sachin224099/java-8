import java.util.Optional;


class Emp{
	String name;

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class Java8OptionalClass {

	public static void main(String[] args) {
		 String[] str = new String[10];     
	      Optional<String> isNull = Optional.ofNullable(str[9]);        
	      if(isNull.isPresent()){     
	         //Getting the substring           
	         String str2 = str[9].substring(2, 5);          
	         //Displaying substring           
	         System.out.println("Substring is: "+ str2);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }                
	      str[9] = "AgraIsCool";       
	      Optional<String> isNull2 = Optional.ofNullable(str[9]);       
	      if(isNull2.isPresent()){        
	         //Getting the substring            
	         String str2 = str[9].substring(2, 5);            
	         //Displaying substring           
	         System.out.println("Substring is: "+ str2);          
	      }         
	      else{         
	         System.out.println("Cannot get the substring from an empty string");         
	      }    

	      
	    //Creating Optional object from a String
	         Optional<String> GOT = Optional.of("Game of Thrones");        
	         //Optional.empty() creates an empty Optional object        
	         Optional<String> nothing = Optional.empty();
	         /* isPresent() method: Checks whether the given Optional         
	          * Object is empty or not.         
	          */        
	         if (GOT.isPresent()) {          
	            System.out.println("Watching Game of Thrones");       
	         } 
	         else {            
	            System.out.println("I am getting Bored");      
	         }
	         /* ifPresent() method: It executes only if the given Optional         
	          * object is non-empty.         
	          */        
	         //This will print as the GOT is non-empty        
	         GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));                
	         //This will not print as the nothing is empty        
	         nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
	         
	         
	         //Creating Optional object from a String
	         Optional<String> GOT1 = Optional.of("Game of Thrones");        
	         //Optional.empty() creates an empty Optional object        
	         Optional<String> nothing1 = Optional.empty();

	         //orElse() method
	         System.out.println(GOT1.orElse("Default Value")); 
	         System.out.println(nothing1.orElse("Default Value")); 

	         //orElseGet() method
	         System.out.println(GOT1.orElseGet(() -> "Default Value")); 
	         System.out.println(nothing1.orElseGet(() -> "Default Value")); 
	         
	         
	       //Creating Optional object from a String       
	         Optional<String> GOT2 = Optional.of("Game of Thrones");       
	         //Optional.empty() creates an empty Optional object       
	         Optional<String> nothing2 = Optional.empty();
	         System.out.println(GOT2.map(String::toLowerCase));        
	         System.out.println(nothing2.map(String::toLowerCase));
	         Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingBad"));        
	         System.out.println("Value of Optional object"+anotherOptional);        
	         System.out.println("Optional.map: "             
	             +anotherOptional.map(gender -> gender.map(String::toUpperCase)));        
	         //Optional<Optional<String>>    -> flatMap -> Optional<String>        
	         System.out.println("Optional.flatMap: "            
	             +anotherOptional.flatMap(gender -> gender.map(String::toUpperCase)));
	         
	      Emp e = new Emp();
	      e.setName("dfg");
	      e.getName().ifPresent(s -> System.out.println(s.toLowerCase()));
	      
	     
	}

}
