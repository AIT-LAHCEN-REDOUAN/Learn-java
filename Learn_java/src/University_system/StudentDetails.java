package University_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends JFrame implements ActionListener {

    Choice crollno ;
    JTable table ;

    JButton search,print,update,cancel,add ;
    StudentDetails(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Search by Roll Number : ");
        heading.setBounds(20,20,150,20);
        add(heading);
        setSize(900,700);
        setLocation(300,100);
        crollno = new Choice();
        crollno.setBounds(180,20,150,20);
        add(crollno);

        try{

            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM student");
            while (rs.next()){
                crollno.add(rs.getString("RoleNumber"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        table = new JTable();

        try {
            Conn c = new Conn();
            ResultSet rs  = c.s.executeQuery("SELECT * FROM student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception e){
            e.printStackTrace();
        }
        JScrollPane jap = new JScrollPane(table);
        jap.setBounds(0,100,900,600);
        add(jap);

        search = new JButton("Search ");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);

        add = new JButton("Add ");
        add.setBounds(120,70,80,20);
        add.addActionListener(this);
        add(add);

        cancel = new JButton("Cancel ");
        cancel.setBounds(220,70,80,20);
        cancel.addActionListener(this);
        add(cancel);

        update = new JButton("Update ");
        update.setBounds(320,70,80,20);
        update.addActionListener(this);
        add(update);

        print = new JButton("Print ");
        print.setBounds(420,70,80,20);
        print.addActionListener(this);
        add(print);



        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == search){
            
        } else if (ae.getSource() == add ) {
            
        } else if (ae.getSource() == print ) {
            try {
                table.print();

            }catch(Exception e){
                e.printStackTrace();
            }
            
        } else if (ae.getSource() == update) {
            
        } else if (ae.getSource() == cancel ) {

        }

    }
   public static void main(String[] Args){
       new StudentDetails();
   }
}
