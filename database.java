import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.lang.*;
public class database implements ActionListener
{
    int x=0;
    Connection con;
    PreparedStatement pst;  
    ResultSet rs,r,v,rr;
    JLabel l1, l2, l3;
    JTextField tf1;
    JButton b;
    JPasswordField p1;
    database()
    {
                    
        JFrame f=new JFrame();
        f.setTitle("Login Form in Windows Form");
        f.setVisible(true);
        f.setSize(800, 800);
        f.setLayout(null);
     	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("Login Form in Windows Form:");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2 = new JLabel("Enter user name:");
        l3 = new JLabel("Enter Password:");
        tf1 = new JTextField();
        p1 = new JPasswordField();
        b = new JButton("Submit");
        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        p1.setBounds(300, 110, 200, 30);
        b.setBounds(150, 160, 100, 30);
        f.add(l1);
        f.add(l2);
        f.add(tf1);
        f.add(l3);
        f.add(p1);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent e)
    {
char[] cc=p1.getPassword();
String ccc=new String(cc);
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "srima");
             
    pst=con.prepareStatement("select * from biodata where uname=? and pwd=?");
}
catch(Exception ee)
{
System.out.println(ee);
}    
    if(checkLogin(tf1.getText(),ccc))
{
try{
 PreparedStatement p1,p2;
String uu=tf1.getText();
 p1=con.prepareStatement("select visit from biodata where uname=?");
 p1.setString(1, uu);
v=p1.executeQuery();
while (v.next())
             {
     x = v.getInt("visit");
        
             }
x=x+1;              
JOptionPane.showMessageDialog(null,"you are succefully logged in.."+x+"times visited");
 p2=con.prepareStatement("update biodata set visit=? where uname=?");
p2.setInt(1, x); 
p2.setString(2, uu);
rr=p2.executeQuery();
}
catch(Exception eee)
{
System.out.println(eee);
}  
}
 else
            
                JOptionPane.showMessageDialog(null,                   "Incorrect userid or password..Try Again with correct detail");

  
             
           }

        //ip:username,password
        //return boolean
    public Boolean checkLogin(String uname,String pwd)
    {
        try {
                        
            pst.setString(1, uname); //this replaces the 1st  "?" in the query for username
            pst.setString(2, pwd);    //this replaces the 2st  "?" in the query for password
            
            rs=pst.executeQuery();
            if(rs.next())
            {
        //TRUE iff the query founds any corresponding data
                return true;
            }
            else
            {
                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
            return false;
        }
}
public static void main(String[] args)
{
new database();
}}