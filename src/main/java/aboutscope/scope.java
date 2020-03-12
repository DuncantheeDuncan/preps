package aboutscope;

class scope{
	int jj;

public void duplicate(){

	// int i; // the variable is allready defined so
		// puting it inside loop is a duplication!!!
		 for (int i=0;i<5 ;i++ ) {
		 // int i;		 	
		 	System.out.println("if you print i'm quiting code");
		 }
}


public void notInitialized(){

	int i = 8;
	int w;

	int ds = 5;

System.out.println(jj + " i am expection an zero");
	System.out.println(i );
}

 // Integer number() {
 //        Integer number;             // line 1
 //        System.out.print(number);   // line 2
 //        return 2/*number*/;              // line 3
 //    }


	public static void main(String[] args) {
		
		int arentAmISupposedToComplain;//??
		scope scp = new scope();

		scp.duplicate();
		scp.notInitialized();

		
	}
}