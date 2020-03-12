package aboutOperatorsAndStatements;

class TestingSwithcStatement{


private int getSortOrder(String firstName, final String lastName){

	final String middleName = " particia"; // if remove 
	// final keyword it will fail at compile time..


	final String suffix = "Jr";

	int id =0;

	switch (firstName) {
		case "phumlani":
		System.out.println("connected..2");
		return 56;
		
		case middleName:
		System.out.println("connected..4");

		return 400;
	}
	return id;
}
	public static void main(String[] args) {
		System.out.println("connected..");

		TestingSwithcStatement run = new TestingSwithcStatement();

		System.out.println(run.getSortOrder("phumlani", "Mthembu"));


	}
}