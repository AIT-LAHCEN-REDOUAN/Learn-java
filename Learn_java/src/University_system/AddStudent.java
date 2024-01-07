package University_system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.*;

public class AddStudent extends JFrame {

    JTextField tfname ,tfphone , tfaddress , tfemail , tfx , tfx1 , tfSN ;
    JLabel labelfrollno ;
    JDateChooser dcdob ;

    JComboBox cbcourse ;

    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L)+1000L);
    AddStudent(){
        setSize(900,700);
        setLocation(350,50);

        setLayout(null);
        JLabel heading = new JLabel("New Student Information");
        heading.setBounds(280,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(100,150,100,50);
        lblname.setFont(new Font("serif",Font.BOLD,20));
        add(lblname);

        tfname  = new JTextField();
        tfname.setBounds(200,160,150,30);
        add(tfname);

        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400,150,200,50);
        lblfname.setFont(new Font("serif",Font.BOLD,20));
        add(lblfname);

        tfname  = new JTextField();
        tfname.setBounds(600,160,150,30);
        add(tfname);

        JLabel lblfrollno = new JLabel("Role Number : ");
        lblfrollno.setBounds(50,230,200,50);
        lblfrollno.setFont(new Font("serif",Font.BOLD,20));
        add(lblfrollno);

        labelfrollno = new JLabel("1533"+first4);
        labelfrollno.setBounds(200,230,200,50);
        labelfrollno.setFont(new Font("serif",Font.BOLD,20));
        add(labelfrollno);

        JLabel lbldob = new JLabel("Date Of Birth ");
        lbldob.setBounds(400,230,200,50);
        lbldob.setFont(new Font("serif",Font.BOLD,20));
        add(lbldob);

        dcdob = new JDateChooser();
        dcdob.setBounds(600,240,150,30);
        add(dcdob);

        JLabel lblfadress = new JLabel("Address :");
        lblfadress.setBounds(100,300,200,50);
        lblfadress.setFont(new Font("serif",Font.BOLD,20));
        add(lblfadress);

        tfaddress  = new JTextField();
        tfaddress.setBounds(200,310,150,30);
        add(tfaddress);

        JLabel lblphone = new JLabel("Phone Number : ");
        lblphone.setBounds(400,300,200,50);
        lblphone.setFont(new Font("serif",Font.BOLD,20));
        add(lblphone);

        tfphone  = new JTextField();
        tfphone.setBounds(600,310,150,30);
        add(tfphone);

        JLabel lblemail = new JLabel("Email :");
        lblemail.setBounds(100,380,200,50);
        lblemail.setFont(new Font("serif",Font.BOLD,20));
        add(lblemail);

        tfemail  = new JTextField();
        tfemail.setBounds(200,390,150,30);
        add(tfemail);

        JLabel lblx = new JLabel("Class X(%) :");
        lblx.setBounds(400,390,200,50);
        lblx.setFont(new Font("serif",Font.BOLD,20));
        add(lblx);

        tfx  = new JTextField();
        tfx.setBounds(600,400,150,30);
        add(tfx);


        JLabel lblx1 = new JLabel("Class XII(%) :");
        lblx1.setBounds(100,470,200,50);
        lblx1.setFont(new Font("serif",Font.BOLD,20));
        add(lblx1);

        tfx1  = new JTextField();
        tfx1.setBounds(260,480,150,30);
        add(tfx1);

        JLabel lblStudentNumber = new JLabel("Student Number :");
        lblStudentNumber.setBounds(450,470,200,50);
        lblStudentNumber.setFont(new Font("serif",Font.BOLD,20));
        add(lblStudentNumber);

        tfSN  = new JTextField();
        tfSN.setBounds(650,480,150,30);
        add(tfSN);

        JLabel lblcourse = new JLabel("Course :");
        lblcourse.setBounds(100,550,200,50);
        lblcourse.setFont(new Font("serif",Font.BOLD,20));
        add(lblcourse);

        String course[] = {"B.Tech","B.BA","B.CA","B.sc","M.sc","M.BA","M.CA","M.com","M.A"};
        cbcourse  = new JComboBox(course);
        cbcourse.setBounds(230,560,150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);



        setVisible(true);
    }
   public static void main(String[] Args){
        new AddStudent();
   }
}
