/* 
 * Lambda expression is a new feature which is introduced in Java 8. 
 * A lambda expression is an anonymous function. A function that doesn’t 
 * have a name and doesn’t belong to any class.
 * */

@FunctionalInterface
interface MyFunctionalInterface {

	//A method with no parameter
    public String sayHello();
}

@FunctionalInterface
interface MyFunctionalInterface1 {

	//A method with single parameter
    public int incrementByFive(int a);
}
public class LambdaExpression {

	public static void main(String[] args) {
		// lambda expression
    	MyFunctionalInterface msg = () -> {
    		return "Hello";
    	};
        System.out.println(msg.sayHello());
        
     // lambda expression with single parameter num
    	MyFunctionalInterface1 f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));

	}

}
