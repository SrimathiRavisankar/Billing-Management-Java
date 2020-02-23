/*java -cp .;"C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib\ojdbc14.jar" srisakjeys*/
import java.io.*;
import java.util.*;
import java.lang.String;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class srisakjeys 
{
int u=0,tot=0;
int bi=0;
static String sn[]=new String[50];
static String ds[]=new String[50];
static String qty[]=new String[50];
static String up[]=new String[50];
static String mfby[]=new String[50];
static String ntwt[]=new String[50];
JFrame f1;
JFrame pe2;
JFrame pc2;
JFrame pz2,pl2;
JTextField ta1;
JLabel l1;
JLabel l2;
JTable f;
JTable ft1;
JPasswordField ta2;
JTextField taw1;
JFrame pt2;
JButton b1;
JTextField tat1;
JTextField tr1;
JTextField tat2;
JTextField tat3;
JTextField tas1;
JTextField tas3;
JTextField tas4;
JTextField tas2;
JTextField tae1;
JTextField tae2;
JTextField tae3;
JTextField tae4;
JTextField tae5;
JTextField tae6;
JTextField tae7;
JTextField tac1;
JTextField tac2;
JTextField tac3;
JTextField tac4;
JTextField tac5;
JTextField tac6;
JTextField tac7;
JTextField tx1;
JTextField tx2;
JTextField tx3;
JTextField tx4;
JTextField tx5;
PreparedStatement pw,pt;
ResultSet pp;
ResultSet rp;
JLabel lt1;
JLabel lt2;
JLabel lt3;
JTable fq;
JFrame ps2;
JButton bbt1;
JButton bbs1;
JButton bbs2;
JButton bbt2;
JButton bbe1;
JButton bbe2;
JButton bbc1;
JButton bbc2;
String mf;
String up1;
String ntwt1;
int ko;
String s9;
Connection conn;
srisakjeys()
{
f1=new JFrame("Login Page");
l1=new JLabel("UserName");
l1.setForeground(Color.blue);
l1.setBounds(20,20,100,20);
ta1=new JTextField(5);
l2=new JLabel("Password");
l2.setBounds(20,20,100,20);
l2.setForeground(Color.blue);
f1.setBackground(Color.black);
JLabel kk=new JLabel("login unsucessful");
ta2=new JPasswordField(5);
ta2.setBounds(20,20,100,20);
ta2.setEchoChar('*');
ta1.setBounds(10,30,300,300);
b1=new JButton("Login");
b1.setBounds(0,0,0,0);
JPanel p1=new JPanel();
JPanel p3=new JPanel();
JPanel p2=new JPanel();
p1.setLayout(new FlowLayout());
p2.setLayout(new FlowLayout());
p3.setLayout(new FlowLayout());
p3.setBounds(20,20,20,20);
p1.add(l1);
p1.setBackground(Color.cyan);
p1.add(ta1);
p2.setBackground(Color.cyan);
p2.add(l2);
p2.add(ta2);
p3.setBackground(Color.cyan);
p3.add(b1);
f1.setSize(300,300);
f1.setVisible(true);
b1.setBounds(150,160,100,30);
f1.add(p1,BorderLayout.NORTH);
f1.add(p2,BorderLayout.CENTER);
f1.add(p3,BorderLayout.SOUTH);
b1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
String str1 = ta1.getText();
        char[] p = ta2.getPassword();
        String str2 = new String(p);
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
PreparedStatement ps7 = con.prepareStatement("select uname from login where uname=? and pass=?");
ps7.setString(1,str1); 
       ps7.setString(2, str2);
ResultSet rs7 = ps7.executeQuery();

if( rs7.next())
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con8 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
PreparedStatement psy = con8.prepareStatement("select spec from login where uname=?");
psy.setString(1,str1);
ResultSet df=psy.executeQuery();

if(df.next())
{
s9=df.getString("spec");
}
if(s9.equals("employee"))
{
System.out.println("employee");
JFrame f2=new JFrame("Selection");
f2.setSize(600,300);
f2.setLayout(new FlowLayout (FlowLayout.CENTER));
f2.setVisible(true);
JPanel p2=new JPanel();
JPanel p3=new JPanel();
p3.setBackground(Color.black);
p2.setBackground(Color.black);
p2.setLayout(new FlowLayout());
p3.setLayout(new BorderLayout());
p3.setBackground(Color.black);
JButton bb1=new JButton("Store");
JButton bb2=new JButton("Supplier");
JButton bb3=new JButton("Transportation");
JButton bb4=new JButton("Customer");
JButton bb5=new JButton("employee");
JButton bb6=new JButton("Bill");
bb1.setBackground(Color.white);
bb2.setBackground(Color.white);
bb3.setBackground(Color.white);
bb4.setBackground(Color.white);
bb5.setBackground(Color.white);
bb6.setBackground(Color.white);
p2.add(bb1);
p2.add(bb5);
p2.add(bb2);
p2.add(bb3);
p2.add(bb4);
p2.add(bb6);
p3.add(p2,BorderLayout.CENTER);
p3.setVisible(true);
f2.add(p2);
bb1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
try
{
pz2=new JFrame("store details");
pz2.setSize(300,300);
pz2.setLayout(new BorderLayout());
pz2.setVisible(true);
Object data[][]={ {" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "},{" "," " ," "," "}};
Object column[]={"storename","branchno","address","phno"};
JTable fz2=new JTable(data,column);
fz2.setVisible(true);
fz2.setBounds(30,40,200,300);
fz2.setColumnSelectionAllowed(true);
fz2.setRowSelectionAllowed(true);
JScrollPane scrollpane=new JScrollPane(fz2);
pz2.add(scrollpane,BorderLayout.CENTER);
DefaultTableModel dm=new DefaultTableModel();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con10 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1","system","sri");
PreparedStatement pz=con10.prepareStatement("select * from store"); 
ResultSet rz1 = pz.executeQuery();
ResultSetMetaData rsmdz=rz1.getMetaData();
int cols=rsmdz.getColumnCount();
String c1[]=new String[cols];
int i;
for(i=0;i<cols;i++)
{
 c1[i]=rsmdz.getColumnName(i+1);
  dm.addColumn(c1[i]);
        }
  Object row1[]=new Object[cols];
  while(rz1.next())
{
 for( i=0;i<cols;i++)
{
  row1[i]=rz1.getString(i+1);
    }
   dm.addRow(row1);        
}
  fz2.setModel(dm);
}
catch(Exception eo)
{
}
}
});


bb3.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
try
{
pl2=new JFrame("transport details");
pl2.setSize(300,300);
pl2.setLayout(new BorderLayout());
pl2.setVisible(true);
Object data[][]={ {" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "},{" "," " ," "}};
Object column[]={"transportno","transportname","lorryno"};
JTable fl2=new JTable(data,column);
fl2.setVisible(true);
fl2.setBounds(30,40,200,300);
fl2.setColumnSelectionAllowed(true);
fl2.setRowSelectionAllowed(true);
JScrollPane scrollpane=new JScrollPane(fl2);
pl2.add(scrollpane,BorderLayout.CENTER);
DefaultTableModel dm=new DefaultTableModel();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con10 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1","system","sri");
PreparedStatement plz=con10.prepareStatement("select * from transport"); 
ResultSet rl1 = plz.executeQuery();
ResultSetMetaData rsmdl=rl1.getMetaData();
int cols=rsmdl.getColumnCount();
String c1[]=new String[cols];
int i;
for(i=0;i<cols;i++)
{
 c1[i]=rsmdl.getColumnName(i+1);
  dm.addColumn(c1[i]);
        }
  Object row1[]=new Object[cols];
  while(rl1.next())
{
 for( i=0;i<cols;i++)
{
  row1[i]=rl1.getString(i+1);
    }
   dm.addRow(row1);        
}
  fl2.setModel(dm);
}
catch(Exception eo)
{
}
}
});
bb2.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae){
JFrame g2=new JFrame("supplier");
g2.setLayout(new BorderLayout());
g2.setVisible(true);
g2.setSize(300,300);
JPanel p2=new JPanel();
try
{
Object data[][]={ {" "," ","  "," "},{" "," "," "," "},{" "," "," "," "},{" "," "," "," "}};
Object column[]={"code","description","quantity"," unit price"};
 fq=new JTable(data,column);
fq.setColumnSelectionAllowed(true);
fq.setRowSelectionAllowed(true);
fq.setVisible(true);
fq.setBounds(30,40,200,300);
JScrollPane scrollpane=new JScrollPane(fq);
g2.add(scrollpane,BorderLayout.CENTER);
DefaultTableModel dm=new DefaultTableModel();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
Statement pss = con.createStatement();
ResultSet rs=pss.executeQuery("select * from suppro");
ResultSetMetaData rsmd=rs.getMetaData();
int cols=rsmd.getColumnCount();
String c[]=new String[cols];
for(int i=0;i<cols;i++){
            c[i]=rsmd.getColumnName(i+1);
            dm.addColumn(c[i]);
        }
        Object row[]=new Object[cols];
        while(rs.next()){
             for(int i=0;i<cols;i++){
                    row[i]=rs.getString(i+1);
                }
            dm.addRow(row);
        }
        fq.setModel(dm);
        con.close();

}
catch(Exception e)
{
System.out.println(e);
}
}
});
bb4.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae){
JFrame g2=new JFrame("customer");
g2.setLayout(new BorderLayout());
g2.setVisible(true);
g2.setSize(300,300);
JPanel p2=new JPanel();
try
{
Object data[][]={ {" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},};
Object column[]={"custno","custfname","custlname","cost","address","contactno","birthday"};
JTable fq2=new JTable(data,column);
fq2.setColumnSelectionAllowed(true);
fq2.setRowSelectionAllowed(true);
fq2.setVisible(true);
fq2.setBounds(30,40,200,300);
JScrollPane scrollpane=new JScrollPane(fq2);
g2.add(scrollpane,BorderLayout.CENTER);
DefaultTableModel dm=new DefaultTableModel();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
Statement pss = con.createStatement();
ResultSet rs=pss.executeQuery("select * from customer");
ResultSetMetaData rsmd=rs.getMetaData();
int cols=rsmd.getColumnCount();
String c[]=new String[cols];
for(int i=0;i<cols;i++){
            c[i]=rsmd.getColumnName(i+1);
            dm.addColumn(c[i]);
        }
        Object row[]=new Object[cols];
        while(rs.next()){
             for(int i=0;i<cols;i++){
                    row[i]=rs.getString(i+1);
                }
            dm.addRow(row);
        }
        fq2.setModel(dm);
        con.close();

}
catch(Exception e)
{
System.out.println(e);
}
}
});





bb5.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
try
{
JFrame pw8=new JFrame("employee details");
pw8.setSize(300,300);
pw8.setLayout(new BorderLayout());
pw8.setVisible(true);
Object data[][]={ {" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "},{" "," "," "," "," "," "," "}};
Object column[]={"eno","ename","address","branch","joindate","salary","bonus"};
JTable fl2=new JTable(data,column);
fl2.setVisible(true);
fl2.setBounds(30,40,200,300);
fl2.setColumnSelectionAllowed(true);
fl2.setRowSelectionAllowed(true);
JScrollPane scrollpane=new JScrollPane(fl2);
pw8.add(scrollpane,BorderLayout.CENTER);
DefaultTableModel dm=new DefaultTableModel();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con10 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1","system","sri");
PreparedStatement plz=con10.prepareStatement("select * from employee"); 
ResultSet rl1 = plz.executeQuery();
ResultSetMetaData rsmdl=rl1.getMetaData();
int cols=rsmdl.getColumnCount();
String c1[]=new String[cols];
int i;
for(i=0;i<cols;i++)
{
 c1[i]=rsmdl.getColumnName(i+1);
  dm.addColumn(c1[i]);
        }
  Object row1[]=new Object[cols];
  while(rl1.next())
{
 for( i=0;i<cols;i++)
{
  row1[i]=rl1.getString(i+1);
    }
   dm.addRow(row1);        
}
  fl2.setModel(dm);
}
catch(Exception eo)
{
}
}
});
bb6.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae){
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
PreparedStatement pu=con.prepareStatement("truncate table bil");
pu.executeQuery();
JFrame f2=new JFrame("bill details");
f2.setSize(300,300);
f2.setLayout(new BorderLayout());
f2.setVisible(true);
bi++;
JPanel p1=new JPanel();
JPanel p2=new JPanel();
JPanel p3=new JPanel();
JPanel p4=new JPanel();
p1.setLayout(new FlowLayout());
JLabel l1=new JLabel("billno");
JLabel l2=new JLabel("date");
JTextField ta1=new JTextField(5);
JTextField ta2=new JTextField(5);
    Calendar cal=new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
    int year=cal.get(Calendar.YEAR);
    int day=cal.get(Calendar.DAY_OF_MONTH);
    ta2.setText(day+"-"+(month+1)+"-"+year);
p1.add(l1);
p1.add(ta1);
p1.add(l2);
p1.add(ta2);
Object data[][]={ {" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},};
Object column[]={"sno","description","qty"};
ft1=new JTable(data,column);
ft1.setColumnSelectionAllowed(true);
ft1.setRowSelectionAllowed(true);
ft1.setVisible(true);
ft1.setBounds(30,40,200,300);
JScrollPane scrollpane=new JScrollPane(ft1);
p2.setLayout(new FlowLayout());
JButton  b1=new JButton("print");
//JButton  b2=new JButton("ok");
p2.add(b1);
//p2.add(b2);
p4.setLayout(new BorderLayout());
p4.add(scrollpane,BorderLayout.NORTH);
p4.add(p2,BorderLayout.SOUTH);
f2.add(p1,BorderLayout.NORTH);
f2.add(p4,BorderLayout.CENTER);
String li=Integer.toString(bi);
ta1.setText(li);
b1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae){
try
{
int count=ft1.getRowCount();
int col=ft1.getColumnCount();
//sn[]=new String[count];
//ds[]=new String[count];
//qty[]=new String[count];
//up[]=new String[count];
//mfby[]=new String[count];
//ntwt[]=new String[count];
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
int k,i=0,y=0;
int tc[]=new int[count];
String y4;
System.out.println("2 nd loop");
int c=0;
for(k=0;k<count;k++)
{
sn[k]=ft1.getValueAt(k,0).toString();
ds[k]=ft1.getValueAt(k,1).toString();
qty[k]=ft1.getValueAt(k,2).toString();
if(sn[k]!=" ")
{
c++;
}
}
System.out.println("/n"+c);
for(k=0;k<c;k++)
{
sn[k]=ft1.getValueAt(k,0).toString();
ds[k]=ft1.getValueAt(k,1).toString();
qty[k]=ft1.getValueAt(k,2).toString();
System.out.println("2 nd loop");
System.out.println(qty[k]);
y4=ds[k];
 ko=Integer.valueOf(qty[k]);
System.out.println("quanity is"+ko);
String k7="pen";
String k8="pencil";
String k9="rubber";
String k3="snacks";
Boolean bo=y4.equals(k7);
PreparedStatement pu=con.prepareStatement("select* from m where des=?");
pu.setString(1,ds[k]);
System.out.println("entered");
ResultSet rs10 = pu.executeQuery();
while(rs10.next())
{
mfby[k]=rs10.getString("mfby");
System.out.println(mfby[k]);
up[k]=rs10.getString("up");
int ko1=Integer.valueOf(up[k]);
System.out.println("unitprice  is"+ko1);
u=ko*ko1;
tc[k]=u;
System.out.println(u);
ntwt[k]=rs10.getString("ntwt");
}
//int h=Integer.parseInt(qty[k]);
//int u=Integer.parseInt(up[k]);
//tc[k]=h*u;
//y+=tc[k];
PreparedStatement p1=con.prepareStatement("insert into bil values(?,?,?,?,?,?)");
p1.setString(1,sn[k]);
p1.setString(2,ds[k]);
p1.setString(3,mfby[k]);
p1.setString(4,up[k]);
p1.setString(5,ntwt[k]);
p1.setInt(6,tc[k]);
tot+=tc[k];
//p1.setInt(6,100);
p1.executeUpdate();
System.out.println("exit");
System.out.println("end of loop");
}
JFrame fu1=new JFrame("print format");
fu1.setSize(300,300);
fu1.setLayout(new BorderLayout());
fu1.setVisible(true);
JLabel l1=new JLabel("Arunachalam and sons provision store");
Object data[][]={ {" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "}};
Object column[]={"sno","description","mfby","ntwt","unitcost","qty","totalcost"};
JTable f2=new JTable(data,column);
f2.setVisible(true);
f2.setBounds(30,40,200,300);
f2.setColumnSelectionAllowed(true);
f2.setRowSelectionAllowed(true);
JScrollPane scrollpane=new JScrollPane(f2);
JLabel l2=new JLabel("total");
taw1=new JTextField(5);
JPanel p1y=new JPanel();
p1y.setLayout(new FlowLayout());
p1y.add(l2);
p1y.add(taw1);
JPanel p3=new JPanel();
p3.setLayout(new BorderLayout());
p3.add(scrollpane,BorderLayout.CENTER);
p3.add(p1y,BorderLayout.SOUTH);
String cx=Integer.toString(tot);
taw1.setText(cx);
fu1.add(l1,BorderLayout.NORTH);
fu1.add(p3,BorderLayout.CENTER);
DefaultTableModel dm=new DefaultTableModel();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con10 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1","system","sri");
PreparedStatement p=con10.prepareStatement("select * from bil"); 
ResultSet rs11 = p.executeQuery();
ResultSetMetaData rsmd=rs11.getMetaData();
int cols=rsmd.getColumnCount();
String c1[]=new String[cols];
for(i=0;i<cols;i++)
{
 c1[i]=rsmd.getColumnName(i+1);
  dm.addColumn(c1[i]);
        }
  Object row1[]=new Object[cols];
  while(rs11.next())
{
 for( i=0;i<cols;i++)
{
  row1[i]=rs11.getString(i+1);
    }
   dm.addRow(row1);        
}
  f2.setModel(dm);
 JLabel l5=new JLabel("Thank you come again contact us on arunachalam@facebook.com");
l5.setForeground(Color.blue);
fu1.add(l1,BorderLayout.NORTH);
fu1.add(p3,BorderLayout.CENTER);
fu1.add(l5,BorderLayout.SOUTH);
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con11=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
//PreparedStatement pu6=con11.prepareStatement("truncate table bil");
//pu6.executeQuery();
}
catch(NumberFormatException ex){
            System.err.println("Ilegal input");
}
catch(Exception es)
{
System.out.println(es);
}
}
});

}
catch(Exception e)
{
System.out.println(e);
}






}
});






}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

else
{
JFrame f2=new JFrame("Selection");
f2.setSize(600,300);
f2.setLayout(new FlowLayout (FlowLayout.CENTER));
f2.setVisible(true);
JPanel p2=new JPanel();
JPanel p3=new JPanel();
p3.setBackground(Color.black);
p2.setBackground(Color.black);
p2.setLayout(new FlowLayout());
p3.setLayout(new BorderLayout());
p3.setBackground(Color.black);
JButton bb1=new JButton("Store");
JButton bb2=new JButton("Supplier");
JButton bb3=new JButton("Transportation");
JButton bb4=new JButton("Customer");
JButton bb5=new JButton("employee");
JButton bb6=new JButton("Bill");
JButton bb7=new JButton("supplier entry");

bb1.setBackground(Color.white);
bb2.setBackground(Color.white);
bb3.setBackground(Color.white);
bb4.setBackground(Color.white);
bb5.setBackground(Color.white);
bb6.setBackground(Color.white);
bb7.setBackground(Color.white);
p2.add(bb1);
p2.add(bb5);
p2.add(bb2);
p2.add(bb3);
p2.add(bb4);
p2.add(bb6);
p2.add(bb7);
p3.add(p2,BorderLayout.CENTER);
p3.setVisible(true);
f2.add(p2);
bb7.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
 pe2=new JFrame("supplier entry details");
pe2.setSize(300,300);
pe2.setLayout(new BorderLayout());
pe2.setVisible(true);
JPanel p1=new JPanel();
p1.setLayout(new FlowLayout());
JPanel f3=new JPanel(new GridLayout(7,2));
f3.setBounds(30,30,10,10);
 tae1=new JTextField(10);
 tae2=new JTextField(10);
 tae3=new JTextField(10);
tae4=new JTextField(10);
 tae5=new JTextField(10);
//tae6=new JTextField(10);
//tae7=new JTextField(10);
JLabel l1=new JLabel("code");
JLabel l2=new JLabel("product");
JLabel l3=new JLabel("qty");
JLabel l4=new JLabel("unitprice");
JLabel l5=new JLabel("total");
bbe1=new JButton ("ok");
bbe2=new JButton ("cancel");
f3.add(l1);
f3.add(tae1);
f3.add(l2);
f3.add(tae2);
f3.add(l3);
f3.add(tae3);
f3.add(l4);
f3.add(tae4);
f3.add(l5);
f3.add(tae5);
///f3.add(l6);
//f3.add(tae6);
//f3.add(l7);
//f3.add(tae7);
p1.add(bbe1);
p1.add(bbe2);
pe2.add(p1,BorderLayout.SOUTH);
pe2.add(f3,BorderLayout.NORTH);
bbe1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
{
String a=tae1.getText();
String b=tae2.getText();
String c=tae3.getText();
String d=tae4.getText();
String e1=tae5.getText();
//String f=tae6.getText();
//String g=tae7.getText();
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
PreparedStatement pse = con.prepareStatement("insert into suppro values(?,?,?,?,?)");
pse.setString(1,a); 
pse.setString(2,b);
pse.setString(3,c);
pse.setString(4,d);
pse.setString(5,e1);
//pse.setString(6,f);
//pse.setString(7,g);
ResultSet rs = pse.executeQuery();
if(rs.next())
{
JOptionPane.showMessageDialog(bbs1, "Data Saved Successfully");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
});
bbe2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
pe2.dispose();
}
});
}
});


bb3.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
pt2=new JFrame("transportation details");
pt2.setSize(300,300);
pt2.setLayout(new BorderLayout());
pt2.setVisible(true);
JPanel p1=new JPanel();
p1.setLayout(new FlowLayout());
p1.setBackground(Color.green);

JPanel f3=new JPanel(new GridLayout(3,2));
f3.setBounds(30,30,10,10);
tat1=new JTextField(10);
 tat2=new JTextField(10);
 tat3=new JTextField(10);
lt1=new JLabel("transport name");
 lt2=new JLabel("transport no:");
 lt3=new JLabel("lorry no");
bbt1=new JButton ("ok");
bbt2=new JButton ("cancel");
f3.add(lt1);
f3.add(tat1);
f3.add(lt2);
f3.add(tat2);
f3.add(lt3);
f3.add(tat3);
p1.add(bbt1);
p1.add(bbt2);
pt2.add(p1,BorderLayout.SOUTH);
pt2.add(f3,BorderLayout.NORTH);
bbt1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
String a=tat1.getText();
String b=tat2.getText();
String c=tat3.getText();
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
PreparedStatement ps = con.prepareStatement("insert into transport values(?,?,?)");
ps.setString(1,a); 
 ps.setString(2, b);
 ps.setString(3, c);
ResultSet rs = ps.executeQuery();
if(rs.next())
{
JOptionPane.showMessageDialog(bbt1, "Data Saved Successfully");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}});
bbt2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
 pt2.dispose();
}
});
}
});
bb1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
ps2=new JFrame("store details");
ps2.setSize(300,300);
ps2.setLayout(new BorderLayout());
ps2.setVisible(true);
JPanel p1=new JPanel();
p1.setLayout(new FlowLayout());
JPanel f3=new JPanel(new GridLayout(4,2));
f3.setBounds(30,30,10,10);
tas1=new JTextField(10);
tas2=new JTextField(10);
tas3=new JTextField(10);
tas4=new JTextField(10);
JLabel l1=new JLabel("store name");
JLabel l2=new JLabel("branch no:");
JLabel l3=new JLabel("address");
JLabel l4=new JLabel("phno");
bbs1=new JButton ("ok");
 bbs2=new JButton ("cancel");
f3.add(l1);
f3.add(tas1);
f3.add(l2);
f3.add(tas2);
f3.add(l3);
f3.add(tas3);
f3.add(l4);
f3.add(tas4);
p1.add(bbs1);
p1.add(bbs2);
ps2.add(p1,BorderLayout.SOUTH);
ps2.add(f3,BorderLayout.NORTH);
bbs1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
{
String a=tas1.getText();
String b=tas2.getText();
String c=tas3.getText();
String d=tas4.getText();
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
PreparedStatement pst = con.prepareStatement("insert into store values(?,?,?,?)");
pst.setString(1,a); 
pst.setString(2,b);
pst.setString(3,c);
pst.setString(4,d);
ResultSet rs = pst.executeQuery();
if(rs.next())
{
JOptionPane.showMessageDialog(bbs1, "Data Saved Successfully");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
});
bbs2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
ps2.dispose();
}
});
}
});
bb5.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
 pe2=new JFrame("employee details");
pe2.setSize(300,300);
pe2.setLayout(new BorderLayout());
pe2.setVisible(true);
JPanel p1=new JPanel();
p1.setLayout(new FlowLayout());
JPanel f3=new JPanel(new GridLayout(7,2));
f3.setBounds(30,30,10,10);
 tae1=new JTextField(10);
 tae2=new JTextField(10);
 tae3=new JTextField(10);
tae4=new JTextField(10);
 tae5=new JTextField(10);
tae6=new JTextField(10);
tae7=new JTextField(10);
JLabel l1=new JLabel("employeeno");
JLabel l2=new JLabel("employee name");
JLabel l3=new JLabel("address");
JLabel l4=new JLabel("branch");
JLabel l5=new JLabel("join date");
JLabel l6=new JLabel("salary");
JLabel l7=new JLabel("bonus");
bbe1=new JButton ("ok");
bbe2=new JButton ("cancel");
f3.add(l1);
f3.add(tae1);
f3.add(l2);
f3.add(tae2);
f3.add(l3);
f3.add(tae3);
f3.add(l4);
f3.add(tae4);
f3.add(l5);
f3.add(tae5);
f3.add(l6);
f3.add(tae6);
f3.add(l7);
f3.add(tae7);
p1.add(bbe1);
p1.add(bbe2);
pe2.add(p1,BorderLayout.SOUTH);
pe2.add(f3,BorderLayout.NORTH);
bbe1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
{
String a=tae1.getText();
String b=tae2.getText();
String c=tae3.getText();
String d=tae4.getText();
String e1=tae5.getText();
String f=tae6.getText();
String g=tae7.getText();
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
PreparedStatement pse = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
pse.setString(1,a); 
pse.setString(2,b);
pse.setString(3,c);
pse.setString(4,d);
pse.setString(5,e1);
pse.setString(6,f);
pse.setString(7,g);
ResultSet rs = pse.executeQuery();
if(rs.next())
{
JOptionPane.showMessageDialog(bbs1, "Data Saved Successfully");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
});
bbe2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
pe2.dispose();
}
});
}
});




bb4.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
pc2=new JFrame("customer details");
pc2.setSize(300,300);
pc2.setLayout(new BorderLayout());
pc2.setVisible(true);
JPanel p1=new JPanel();
p1.setLayout(new FlowLayout());
JPanel f3=new JPanel(new GridLayout(7,2));
f3.setBounds(30,30,10,10);
 tac1=new JTextField(10);
tac2=new JTextField(10);
tac3=new JTextField(10);
tac4=new JTextField(10);
tac5=new JTextField(10);
tac6=new JTextField(10);
tac7=new JTextField(10);
JLabel l1=new JLabel("custno:");
JLabel l2=new JLabel("customer firstname");
JLabel l3=new JLabel("customer lastname");
JLabel l4=new JLabel("cost of purchase");
JLabel l5=new JLabel("address");
JLabel l6=new JLabel("contact no");
JLabel l7=new JLabel("Birthday");
bbc1=new JButton ("ok");
bbc2=new JButton ("cancel");
f3.add(l1);
f3.add(tac1);
f3.add(l2);
f3.add(tac2);
f3.add(l3);
f3.add(tac3);
f3.add(l4);
f3.add(tac4);
f3.add(l5);
f3.add(tac5);
f3.add(l6);
f3.add(tac6);
f3.add(l7);
f3.add(tac7);
p1.add(bbc1);
p1.add(bbc2);
pc2.add(p1,BorderLayout.SOUTH);
pc2.add(f3,BorderLayout.NORTH);
bbc1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
{
String a=tac1.getText();
String b=tac2.getText();
String c=tac3.getText();
String d=tac4.getText();
String e1=tac5.getText();
String f=tac6.getText();
String g=tac7.getText();
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
PreparedStatement psc = con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
psc.setString(1,a); 
psc.setString(2,b);
psc.setString(3,c);
psc.setString(4,d);
psc.setString(5,e1);
psc.setString(6,f);
psc.setString(7,g);
ResultSet rs = psc.executeQuery();
if(rs.next())
{
JOptionPane.showMessageDialog(bbc1, "Data Saved Successfully");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
});
bbc2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae){
pc2.dispose();
}
});
}
});
bb2.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae){
JFrame g2=new JFrame("supplier");
g2.setLayout(new BorderLayout());
g2.setVisible(true);
g2.setSize(300,300);
JPanel p2=new JPanel();
try
{
Object data[][]={ {" "," ","  "," "},{" "," "," "," "},{" "," "," "," "},{" "," "," "," "}};
Object column[]={"code","description","quantity"," unit price"};
 f=new JTable(data,column);
f.setColumnSelectionAllowed(true);
f.setRowSelectionAllowed(true);
f.setVisible(true);
f.setBounds(30,40,200,300);
JScrollPane scrollpane=new JScrollPane(f);
g2.add(scrollpane,BorderLayout.CENTER);
DefaultTableModel dm=new DefaultTableModel();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
Statement pss = con.createStatement();
ResultSet rs=pss.executeQuery("select * from suppro");
ResultSetMetaData rsmd=rs.getMetaData();
int cols=rsmd.getColumnCount();
String c[]=new String[cols];
for(int i=0;i<cols;i++){
            c[i]=rsmd.getColumnName(i+1);
            dm.addColumn(c[i]);
        }
        Object row[]=new Object[cols];
        while(rs.next()){
             for(int i=0;i<cols;i++){
                    row[i]=rs.getString(i+1);
                }
            dm.addRow(row);
        }
        f.setModel(dm);
        con.close();

}
catch(Exception e)
{
System.out.println(e);
}
}
});
bb6.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae){
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
//PreparedStatement pu=con.prepareStatement("truncate table bil");
//pu.executeQuery();
JFrame f2=new JFrame("bill details");
f2.setSize(300,300);
f2.setLayout(new BorderLayout());
f2.setVisible(true);
bi++;
JPanel p1=new JPanel();
JPanel p2=new JPanel();
JPanel p3=new JPanel();
JPanel p4=new JPanel();
p1.setLayout(new FlowLayout());
JLabel l1=new JLabel("billno");
JLabel l2=new JLabel("date");
JTextField ta1=new JTextField(5);
JTextField ta2=new JTextField(5);
    Calendar cal=new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
    int year=cal.get(Calendar.YEAR);
    int day=cal.get(Calendar.DAY_OF_MONTH);
    ta2.setText(day+"-"+(month+1)+"-"+year);
p1.add(l1);
p1.add(ta1);
p1.add(l2);
p1.add(ta2);
Object data[][]={ {" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},{" "," "," "},};
Object column[]={"sno","description","qty"};
ft1=new JTable(data,column);
ft1.setColumnSelectionAllowed(true);
ft1.setRowSelectionAllowed(true);
ft1.setVisible(true);
ft1.setBounds(30,40,200,300);
JScrollPane scrollpane=new JScrollPane(ft1);
p2.setLayout(new FlowLayout());
JButton  b1=new JButton("print");
//JButton  b2=new JButton("ok");
p2.add(b1);
//p2.add(b2);
p4.setLayout(new BorderLayout());
p4.add(scrollpane,BorderLayout.NORTH);
p4.add(p2,BorderLayout.SOUTH);
f2.add(p1,BorderLayout.NORTH);
f2.add(p4,BorderLayout.CENTER);
String li=Integer.toString(bi);
ta1.setText(li);
b1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae){
try
{
int count=ft1.getRowCount();
int col=ft1.getColumnCount();
//sn[]=new String[count];
//ds[]=new String[count];
//qty[]=new String[count];
//up[]=new String[count];
//mfby[]=new String[count];
//ntwt[]=new String[count];
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
int k,i=0,y=0;
int tc[]=new int[count];
String y4;
System.out.println("2 nd loop");
int c=0;
for(k=0;k<count;k++)
{
sn[k]=ft1.getValueAt(k,0).toString();
ds[k]=ft1.getValueAt(k,1).toString();
qty[k]=ft1.getValueAt(k,2).toString();
if(sn[k]!=" ")
{
c++;
}
}
System.out.println("/n"+c);
for(k=0;k<c;k++)
{
sn[k]=ft1.getValueAt(k,0).toString();
ds[k]=ft1.getValueAt(k,1).toString();
qty[k]=ft1.getValueAt(k,2).toString();
System.out.println("2 nd loop");
System.out.println(qty[k]);
y4=ds[k];
 ko=Integer.valueOf(qty[k]);
System.out.println("quanity is"+ko);
String k7="pen";
String k8="pencil";
String k9="rubber";
String k3="snacks";
Boolean bo=y4.equals(k7);
PreparedStatement pu=con.prepareStatement("select* from m where des=?");
pu.setString(1,ds[k]);
System.out.println("entered");
ResultSet rs10 = pu.executeQuery();
while(rs10.next())
{
mfby[k]=rs10.getString("mfby");
System.out.println(mfby[k]);
up[k]=rs10.getString("up");
int ko1=Integer.valueOf(up[k]);
System.out.println("unitprice  is"+ko1);
u=ko*ko1;
tc[k]=u;
System.out.println(u);
ntwt[k]=rs10.getString("ntwt");
}
//int h=Integer.parseInt(qty[k]);
//int u=Integer.parseInt(up[k]);
//tc[k]=h*u;
//y+=tc[k];
PreparedStatement p1=con.prepareStatement("insert into bil values(?,?,?,?,?,?)");
p1.setString(1,sn[k]);
p1.setString(2,ds[k]);
p1.setString(3,mfby[k]);
p1.setString(4,up[k]);
p1.setString(5,ntwt[k]);
p1.setInt(6,tc[k]);
tot+=tc[k];
//p1.setInt(6,100);
p1.executeUpdate();
System.out.println("exit");
System.out.println("end of loop");
}
JFrame fu1=new JFrame("print format");
fu1.setSize(300,300);
fu1.setLayout(new BorderLayout());
fu1.setVisible(true);
JLabel l1=new JLabel("Arunachalam and sons provision store");
Object data[][]={ {" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "},{" "," " ," "," "," "," "," "}};
Object column[]={"sno","description","mfby","ntwt","unitcost","qty","totalcost"};
JTable f2=new JTable(data,column);
f2.setVisible(true);
f2.setBounds(30,40,200,300);
f2.setColumnSelectionAllowed(true);
f2.setRowSelectionAllowed(true);
JScrollPane scrollpane=new JScrollPane(f2);
JLabel l2=new JLabel("total");
taw1=new JTextField(5);
JPanel p1y=new JPanel();
p1y.setLayout(new FlowLayout());
p1y.add(l2);
p1y.add(taw1);
JPanel p3=new JPanel();
p3.setLayout(new BorderLayout());
p3.add(scrollpane,BorderLayout.CENTER);
p3.add(p1y,BorderLayout.SOUTH);
String cx=Integer.toString(tot);
taw1.setText(cx);
fu1.add(l1,BorderLayout.NORTH);
fu1.add(p3,BorderLayout.CENTER);
DefaultTableModel dm=new DefaultTableModel();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con10 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1","system","sri");
PreparedStatement p=con10.prepareStatement("select * from bil"); 
ResultSet rs11 = p.executeQuery();
ResultSetMetaData rsmd=rs11.getMetaData();
int cols=rsmd.getColumnCount();
String c1[]=new String[cols];
for(i=0;i<cols;i++)
{
 c1[i]=rsmd.getColumnName(i+1);
  dm.addColumn(c1[i]);
        }
  Object row1[]=new Object[cols];
  while(rs11.next())
{
 for( i=0;i<cols;i++)
{
  row1[i]=rs11.getString(i+1);
    }
   dm.addRow(row1);        
}
  f2.setModel(dm);
 JLabel l5=new JLabel("Thank you come again contact us on arunachalam@facebook.com");
l5.setForeground(Color.blue);
fu1.add(l1,BorderLayout.NORTH);
fu1.add(p3,BorderLayout.CENTER);
fu1.add(l5,BorderLayout.SOUTH);
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con11=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1", "system", "sri");
//PreparedStatement pu6=con11.prepareStatement("truncate table bil");
//pu6.executeQuery();
}
catch(NumberFormatException ex){
            System.err.println("Ilegal input");
}
catch(Exception es)
{
System.out.println(es);
}
}
});

}
catch(Exception e)
{
System.out.println(e);
}

}
});
}
}
else
{
JOptionPane.showMessageDialog(null,
                   "Incorrect email-Id or password..Try Again with correct detail");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
        });

}
public static void main(String args[])
{
srisakjeys h=new srisakjeys();
}
}
