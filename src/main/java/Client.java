//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.event.*;
//import java.sql.*;
//import java.rmi.*;
//import javax.net.*;
//import javax.net.ssl.*;
//import clientMessenger.*;
//
//
//public class Client extends JPanel implements WindowListener, ActionListener  {
//    private Object cw;
////    @Override
////    public void actionPerformed(ActionEvent actionEvent) {
////
////    }
//
//    @Override
//    public void windowOpened(WindowEvent windowEvent) {
//
//    }
//
//    @Override
//    public void windowClosing(WindowEvent windowEvent) {
//
//    }
//
//    @Override
//    public void windowClosed(WindowEvent windowEvent) {
//
//    }
//
//    @Override
//    public void windowIconified(WindowEvent windowEvent) {
//
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent windowEvent) {
//
//    }
//
//    @Override
//    public void windowActivated(WindowEvent windowEvent) {
//
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent windowEvent) {
//
//    }
//
//    private JList list;
//    private DefaultListModel listModel;
//    private JPanel topPanel;
//    private JButton talkButton;
//    private JButton checkButton;
//    private JButton send;
////    private ConvWindow cw;
//    private JTextArea mainfield;
//    private String user_name;
//    private String recipient_name;
//    private String temp_name;
//    private String msg_str;
//    private String temprname;
//    public Client(String user_name, JFrame parent)
//    {
//        super(new BorderLayout());
//        topPanel = new JPanel ();
//        parent.addWindowListener(this);
//        listModel = new DefaultListModel();
//        addContactsFromDB(listModel, user_name);
////Create the list and put it in a scroll pane
//        list = new JList(listModel);
//        list.setFixedCellWidth(200);
//        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        list.setSelectedIndex(0);
//        list.setVisibleRowCount(5);
//        JScrollPane listScrollPane = new JScrollPane(list);
//        talkButton = new JButton("Start conversation");
//        talkButton.addActionListener(this);
//        talkButton.setEnabled(true);
//        checkButton = new JButton("Check messages");
//        checkButton.addActionListener(this);
//        checkButton.setEnabled(true);
////Create a panel that uses BoxLayout
//        JPanel buttonPane = new JPanel();
//        buttonPane.setLayout(new BoxLayout(buttonPane,
//                BoxLayout.LINE_AXIS));
//        buttonPane.add(talkButton);
//        buttonPane.add(checkButton);
//        buttonPane.setBorder(BorderFactory.
//                createEmptyBorder(5,5,5,5));
//        topPanel.add(listScrollPane, BorderLayout.CENTER);
//        topPanel.add(buttonPane, BorderLayout.PAGE_END);
//        add(topPanel);
////        te
//    }
//    public void actionPerformed (ActionEvent e) {
//        if (e.getSource () == talkButton) {
//            Object obj_name = list.getSelectedValue();
//            recipient_name = ""+obj_name+"";
//            user_name = temp_name;
////converse with currently selected user
//            makeConversationWindow(recipient_name,user_name,msg_str);
//        }
//        else if (e.getSource () == checkButton) {
//            user_name = temp_name;
//            receiveMessage(user_name);
//        }
//        else if (e.getSource () == send) {
//            recipient_name = get_recipient();
//            String s = cw.sendmsg(recipient_name);
//// We want to set the text string to this new value
//            System.out.println("Current text now being set to:\n"+ s);
//            try {mp_name = user_name;
//                String url = "//192.168.0.11/ConversationHandlerInterface";
//                ConversationHandlerInterface ch =(ConversationHandlerInterface)
//                        Naming.lookup (url);
//                ch.conversationHandler(s, recipient_name, user_name);
//            }
//            catch (RemoteException r) { System.err.println (r); }
//            catch (Exception ex) { System.err.println (ex); }
//        }
//    }
//
//    public void addContactsFromDB(DefaultListModel listModel,
//                                  String user_name) {
//        System.out.println("logs in as "+user_name);
//        Connection db = null;
//        try {
//            String driver = "com.mysql.jdbc.Driver";
//            Class.forName(driver).newInstance();
//            String url = "jdbc:mysql://192.168.0.11:3306/messenger";
//            db = DriverManager.getConnection(url,"testuser","");
//// Show users who are online AND are not the logged-in user
//            String command = "SELECT * FROM userprofile  WHERE temporaryIP != 'NULL' AND   useralias != '"+user_name+"'";
//            Statement stmt = db.createStatement();
//            ResultSet rs = stmt.executeQuery(command);
////display results
//            while (rs.next()) {
//                String contact = rs.getString("useralias");
//                listModel.addElement (contact);
//            }
//        }
//// Catch any exceptions that are thrown.
//        catch (ClassNotFoundException c) {
//            System.out.println(c.toString());
//        }
//        catch(Exception x) {
//            System.err.println(x.toString());
//        }
//        finally {
//// Always close the the db connection
//            try {
//                db.close();
//            }
//            catch (Exception ex) {}
//        }
//    }
//    public void logOffFromDB(String user_name) {
//        System.out.println(user_name+" is logging off.");
//        Connection db = null;
//        try {
//            String driver = "com.mysql.jdbc.Driver";
//            Class.forName(driver).newInstance();
//            String url = "jdbc:mysql://192.168.0.11/messenger";
//            db = DriverManager.getConnection(url,"testuser","");
//// Create SQL update to set logged-off user's IP address to NULL
//            String command = "UPDATE userprofile SET temporaryIP = 'NULL'  WHERE useralias = '"+user_name+"'";
//            Statement stmt = db.createStatement();
//            stmt.executeUpdate(command);
//        }
//// Catch any exceptions that are thrown.
//        catch (ClassNotFoundException c) {
//            System.out.println(c.toString());
//        }
//        catch(Exception x) {
//            System.err.println(x.toString());
//        }
//        finally {
//// Always close the the db connection
//            try {
//                db.close();
//            }
//            catch (Exception ex) {}
//        }
//    }
//    // Pick up conversation window if it is meant for user
//    public void receiveMessage (String user_name) {
////Notify that user has received a message
//        System.out.println ("recieveconv");
//        try {
//// The IP address of the Linux server is 192.168.0.11
//            String url = "//192.168.0.11/ConversationHandlerInterface";
//            ConversationHandlerInterface chi =
//                    (ConversationHandlerInterface) Naming.lookup (url);
//// Picks up the message string from server
//            String str = chi.checkForMessages(user_name);
//            String recipient_name = chi.getMessageSender();
//            if (str.equals("null")) {
//                System.out.println ("No messages");
//            }
//            else {
//                makeConversationWindow (finally {
//// Always close the the db connection
//                    try {
//                        db.close();
//                    }
//                    catch (Exception ex) {}
//                }
//            }
//// Pick up conversation window if it is meant for user
//            public void receiveMessage (String user_name) {
////Notify that user has received a message
//                System.out.println ("recieveconv");
//                try {
//// The IP address of the Linux server is 192.168.0.11
//                    String url = "//192.168.0.11/ConversationHandlerInterface";
//                    ConversationHandlerInterface chi =
//                            (ConversationHandlerInterface) Naming.lookup (url);
//// Picks up the message string from server
//                    String str = chi.checkForMessages(user_name);
//                    String recipient_name = chi.getMessageSender();
//                }
//                catch (RemoteException r) { System.err.println (r); }
//                catch (Exception e) { System.err.println (e); }
//            }
//
//
//
//        public void makeConversationWindow (String recipient_name,
//                String user_name, String msg_str) {
//            System.out.println(user_name+" makes convwindow!");
//            System.out.println("convwindow intended for "+recipient_name);
//                    JFrame.setDefaultLookAndFeelDecorated(true);
//            JFrame f = new JFrame ("Conversation with "+recipient_name);
//            cw = new ConvWindow (recipient_name, user_name, msq_str, f);
//            f.getContentPane ().add ((Component) cw);
//            f.pack ();
//            f.setVisible (true);
//            mainfield = cw.getTextArea();
//            send = cw.getButton();
//            set_recipient(recipient_name);
//            send.addActionListener(this);
//        }
//        public void set_recipient(String rname) {
//            temprname = rname;
//        }
//        public String get_rec
//        public void set_recipient(String rname) {
//            temprname = rname;
//        }
//        public String get_recipient () {
//            return temprname;
//        }
//// Methods required for WindowListener
//        public void windowOpened (WindowEvent e) {
//        }
//        public void windowIconified (WindowEvent i) {
//        }
//        public void windowDeiconified (WindowEvent d) {
//        }
//        public void windowActivated (WindowEvent a) {
//        }
//        public void windowDeactivated (WindowEvent a) {
//        }
//        public void windowClosing (WindowEvent c) {
//            user_name = temp_name;
//            System.out.println("Window closes as "+user_name);
//            logOffFromDB(user_name);
//            System.exit(0);
//        }
//
//
//    }
//}
