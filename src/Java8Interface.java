interface MyInterfacee {
	/*
	 * This is a default method so we need not to implement this method in the
	 * implementation classes
	 */
	default void newMethod() {
		System.out.println("Newly added default method");
		display();
	}

	/*
	 * Already existing public and abstract method We must need to implement
	 * this method in implementation classes.
	 */
	void existingMethod(String str);

	static void display() {
		System.out.println("inteface static method - 1");
	}

	static void display1() {
		System.out.println("inteface static method - 2");
	}
}

class Super {
	protected void method() {
		System.out.println("super");
	}
}

class child extends Super {
	@Override
	protected void method() {
		super.method();
		System.out.println("child");
	}
}

class H implements MyInterfacee {

	@Override
	public void existingMethod(String str) {
		System.out.println();

	}

	/*
	 * public void newMethod(){ System.out.println("bdbf");
	 * 
	 * }
	 */
}

public class Java8Interface {

	public static void main(String[] args) {
		Super ob = new child();
		ob.method();

		H h = new H();
		h.newMethod();
		MyInterfacee.display();
	}

}
