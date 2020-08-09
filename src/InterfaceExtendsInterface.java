interface Base{
	default void display(){
		System.out.println("Super");
	}
	
	static void print(){
		System.out.println("Super");
	}
}
interface Child1 extends Base{
	default void display(){
		System.out.println("Child");
	}
	static void print(){
		System.out.println("Child");
	}
	
}
class My implements Child1{
	
}
public class InterfaceExtendsInterface {
	public static void main(String[] args){
		
		
	}
}
