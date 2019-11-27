
import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;
        import javax.swing.event.*;
        import javax.net.*;
        import java.rmi.*;
        import java.rmi.server.*;
        import java.util.*;
//        import clientMessenger.*;
public class App extends UnicastRemoteObject implements ConversationHandlerInterface {
    private static Remote chs;
    String the_recipient;
    String the_user;
    String string_new;
    String set_sender;
    protected App() throws RemoteException {
super();

    }

    public void conversationHandler (String s, String recipient_name, String user_name) throws RemoteException {
        System.out.println("The conversation started by "+user_name+" for "+recipient_name+" has passed through the server!");
        the_recipient = recipient_name;
        the_user = user_name;
        string_new = s;
    }

    public String checkForMessages (String caller_name) {
//Display that a user has pressed to check messages
        System.out.println(caller_name + " is checking for messages...");
// If there is a message for the user, return the string
        System.out.println("message for recipient: " + the_recipient);
//        _FA_
        if (caller_name.equals(the_recipient)) {
            setMessageSender(the_user);
        } else {
            String fail = "null";
            return fail;
        }
        return "";
    }
     void setMessageSender(String sender) {
        set_sender = sender;
    }

    public String getMessageSender () {
        return set_sender;
    }

    public static void main (String [] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            String name = "//192.168.0.11/ ConversationHandlerInterface";
            Naming.rebind (name,chs);
            System.out.println("Server is running and ready to accept conversations.");
        }
        catch (Exception e) {
            System.err.println ("Server Exception: " +
                    e.getMessage());
        }
    }
}
//}
