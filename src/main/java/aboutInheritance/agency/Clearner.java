package aboutInheritance.agency;


  class Clearner extends Person implements uniform{
       

    private int shiftDur;
    private double salary;
    private String fname;
    private String lname;


    Clearner(String fname, String lname,int shiftDur, double salary){// overloading
        super(fname , lname);
        // this.dob = dob;
        this.shiftDur = shiftDur;
        this.salary = salary;
        this.fname = fname;
        this.lname = lname;
    
    }
    Clearner(){
        this("no","no",0,2.0);
    }


// TODO: is_the_uniform_on  false


public void putonUniform(){
        System.out.println("the uniform is on, you can work now.");
}
    void shiftDuration(){
    System.out.print("My shift is "+shiftDur+" hours ");
    System.out.println("My Basic salary is R"+salary+"");
}
@Override
public String makepersonalDetails(){// overriding
    
    return "start with surname => "+ lname+" then follow with surname "+ fname;}

}
