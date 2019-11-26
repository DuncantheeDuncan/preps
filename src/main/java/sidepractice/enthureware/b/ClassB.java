package sidepractice.enthureware.b;

import a.ClassA;

public class ClassB extends ClassA{
	// void f(){
	// 	System.out.println("connected..");

	// } this is not allowed overidding a final method!
	

	public static void main(String[] args) {
		

		ClassB b = new ClassB();
		// ClassB b = new ClassA();

		System.out.println("connected..");

		System.out.println();
		// b.f();




	}
}