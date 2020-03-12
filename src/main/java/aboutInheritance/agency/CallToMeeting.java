package aboutInheritance.agency;
import java.time.LocalDate;


 class CallToMeeting extends Person{
private String lname;
private String fname;

     CallToMeeting(String fname,String lname){
        super(fname,lname);
        this.lname = lname;
        this.fname =fname;

     }

    public void mettingTime(Person p){

            System.out.println("Mr "+ this.fname+" "+ lname+" this is to " +
                    "serve as a reminder to a meting"+
                    " on "+ LocalDate.now().plusDays(20));
       
    }
 }