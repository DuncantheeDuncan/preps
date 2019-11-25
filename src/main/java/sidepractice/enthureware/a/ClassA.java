package a;

public  class ClassA{

	public int a;
	// this field is not available 
	// outside a package, but to access it, the field 
	// must be public since the class accessing it is 
	// outside the package!!

	int b =2; //default no access modifires

	protected void c(){
		System.out.println("protected void c");
	} //not available outside the package

	private void d(){
		System.out.println("private void d");
	}// only visible to this class only

	public void e(){
		System.out.println("public void e");
	}
	public final void f(){
		System.out.println("public final void f");
	}
}