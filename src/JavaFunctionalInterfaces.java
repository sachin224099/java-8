import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

@FunctionalInterface
interface MyFunctionalInterface3 {

    public int addMethod(int a, int b);
    
/* 
 * The docs also state:
 * If an interface declares an abstract method overriding one of the 
 * public methods of java.lang.Object, that also does not count toward 
 * the interface's abstract method count since any implementation of the
 * interface will have an implementation from java.lang.Object or elsewhere.
 *  
 *  And since equals is one of those methods, the "abstract method count" 
 *  of the interface is still 1.
 *  
 * */
    boolean equals(Object obj);
}

class CD{
	public static int getLength(String str) throws Exception{
		if(str.length() == 5)
			throw new RuntimeException();
	return str.length();	
	}
}
public class JavaFunctionalInterfaces {

	public static void main(String[] args) {
		
		Supplier<Double> sup = () -> {
			return Math.random();
		};
		System.out.println("Random - " + sup.get());
		
		Consumer<String> cons = (value) -> System.out.println(value);
		
		cons.accept("sachin");
		
		// lambda expression
    	MyFunctionalInterface3 sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.addMethod(12, 100));
        
        
        // lambda expression
        IntBinaryOperator sum1 = (a, b) -> a + b;
        System.out.println("Result: " + sum1.applyAsInt(12, 100));
        
        
        //Exception handling in stream
        Arrays.asList("dsf","ds", "dfsdf", "fds", "dfd").stream().forEach(
        		str ->{
        			
						try {
							System.out.println(CD.getLength(str));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
        		}
        		);
        
       // Arrays.asList("dsf","ds", "dfsdf", "fds", "dfd").stream().forEach(str -> CD.getLength(str));

	}

}
