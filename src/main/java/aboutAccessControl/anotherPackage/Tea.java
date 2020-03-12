package aboutAccessControl.anotherPackage;

//import aboutAccessControl.Baverage; // cannot import because
// the source file is not public


import aboutAccessControl.AclassToHelpMeAcces;

public class Tea  extends AclassToHelpMeAcces {
    @Override
    public void isAccesseble() {
        super.isAccesseble();
        System.out.println("yeah!");
    }

    public static void main(String[] args) {

//        Baverage b = new Baverage(); // also making an instance
//        of a class that is not public and outside of the package.

        AclassToHelpMeAcces magic = new Tea();
        magic.isAccesseble();

        System.out.println("one");


    }
}
