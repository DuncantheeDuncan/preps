package sidepractice.kaplanReview;

import java.io.IOException;

class BlankTry{
public static void ii() throws IOException {

	throw  new IOException();
}
	public static void main(String[] args) throws IOException {
		
	System.out.println("phumlani");


	try{
		System.out.println("insede.. ");
		 ii();
	}catch(IOException e ){
//		throw new IOException();
System.out.println("IOException.. ");

	}
}
}