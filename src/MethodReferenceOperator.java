import java.util.Arrays;
import java.util.function.BiFunction;

@FunctionalInterface 
interface MyInterface{  
    void display();  
}  

//Method reference to a static method of a class
class Multiplication{  
	   public static int multiply(int a, int b){  
		return a*b;  
	   }  
	} 

//Method reference to a constructor
@FunctionalInterface 
interface MyInterface2{  
    Hello display(String say);  
} 
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}
public class MethodReferenceOperator {
	public void myMethod(){  
		System.out.println("Instance Method");  
	    }  
	public static void main(String[] args) {
		MethodReferenceOperator obj = new MethodReferenceOperator(); 
		
		//1- Method reference using the object of the clas
		MyInterface ref = obj :: myMethod;
		
		//1- Calling the method of functional interface
		ref.display();
		
		//2-Method reference to a static method of a class
		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
		int pr = product.apply(11, 5);  
		System.out.println("Product of given number is: "+pr);
		
		
		String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		/* Method reference to an instance method of an arbitrary 
		 * object of a particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for(String str: stringArray){
			System.out.println(str);
		}
		
		//Method reference to a constructor
        MyInterface2 ref1 = Hello::new;  
        ref1.display("Hello World!");

	}

}
