package sidepractice.enthureware.GC;

public class TestingGC {

    public Object getObject() {
        Object object1 = new String("New_String");
        Object objectArray[] = new Object[1];

        objectArray[0] = object1; //After this line, object1 and objectArray[0] are pointing to the same String object.
        object1 = null; //After this line, object1 points to null but objectArray[0] is still pointing to the String object.



        objectArray[0] = null; //After this line objectArray[0] also starts pointing to null so there is no reference left that is pointing to the String object.
        //So it is now available for Garbage collection.
        return object1;
    }

    public static void main(String[] args) {
        TestingGC t = new TestingGC();

        System.out.println(t.getObject());

        if(true) System.out.println("one");
//        else System.out.println("two");
    }
}
