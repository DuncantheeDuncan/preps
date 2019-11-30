package aboutWrapperClassesConstructors;

// import static java.lang.*;
class WrapperClasses{

	public static void main(String[] args) {
		
int str = 2;
int str2 = 2;
System.out.print("primitives ");
System.out.println( str == str2);// primitives
Integer it = 2;
Integer it2 = 2;

System.out.println(it != it2);
System.out.println();

Float fl = 12.9f;
float fl2 = 12.9f;
System.err.println(fl == fl2);


System.out.println("connected.");

Integer inte = new Integer("1234");
Boolean boly2 = new Boolean("true");
Boolean boly = Boolean.parseBoolean("0");
Float floaty = new Float("12");
Character chara = new Character('9'); // characters does not provide two constructors
char one = 'p' +' ' +'h'+ 'u'+'m'+'l'+'a'+'n'; // the output  is ver strange i odnt know why..


System.out.println("integer " +inte);
System.out.println("boolean "+ boly);
System.err.println("bolloen 2 "+ boly2);
System.err.println("float "+ floaty);
System.out.println("character "+chara );
System.out.println("char "+ one);




	}
}