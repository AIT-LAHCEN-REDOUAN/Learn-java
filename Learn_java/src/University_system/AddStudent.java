package University_system;

import javax.swing.*;
import java.awt.*;

public class AddStudent extends JFrame {

    AddStudent(){
        setSize(900,700);
        setLocation(350,50);

        setLayout(null);
        JLabel heading = new JLabel("New Student Information");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(310,150,100,50);
        lblname.setFont(new Font("serif",Font.BOLD,20));
        add(lblname);


        setVisible(true);
    }
   public static void main(String Args){
       new AddStudent();
   }
}
