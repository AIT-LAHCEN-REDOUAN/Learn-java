package University_system;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class AddStudent extends JFrame {

    JTextField tfname ,tffname ;
    JLabel labelfrollno ;

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


        setVisible(true);
    }
   public static void main(String[] Args){
        new AddStudent();
   }
}
