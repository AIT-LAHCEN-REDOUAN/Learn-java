package University_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {

    JButton Button_login,cancel;
    JTextField tfUsername , pfPassword ;
    login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Username label
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(40, 20, 100, 20);
        add(lblUsername);

        // Username input field
         tfUsername = new JTextField();
        tfUsername.setBounds(150, 20, 150, 20);
        add(tfUsername);

        // Password label
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(40, 70, 100, 20);
        add(lblPassword);

        // Password input field
         pfPassword = new JPasswordField();
        pfPassword.setBounds(150, 70, 150, 20);
        add(pfPassword);

        //Button Field
        Button_login = new JButton("Login");
        Button_login.setBounds(40,140,120,30);
        Button_login.setBackground(Color.green);
        Button_login.setForeground(Color.white);
        Button_login.addActionListener(this);
        Button_login.setFont(new Font("lato",Font.ROMAN_BASELINE,15));
        add(Button_login);

        //Cancel Field
        cancel = new JButton("cancel");
        cancel.setBounds(180,140,120,30);
        cancel.setBackground(Color.red);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        cancel.setFont(new Font("lato",Font.ROMAN_BASELINE,15));
        add(cancel);

        ImageIcon i1 = new ImageIcon(getClass().getResource("/University_system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,20,200,200);
        add(image);

        setSize(600, 300);
        setLocation(500, 250);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){

        if (ae.getSource() == Button_login){
             String username = tfUsername.getText() ;
             String password = pfPassword.getText();

            String query = "SELECT * FROM login WHERE username = '" + username + "' AND password = '" + password + "'";

            try {
              Conn c = new Conn();
              ResultSet rs =  c.s.executeQuery(query);

              if (rs.next()){
                  setVisible(false);
                  new Project();
              } else {
               JOptionPane.showMessageDialog(null,"Invalid UserName Or Password");
               setVisible(false);
              }
              c.s.close();
             }catch(Exception e){
                 e.printStackTrace();
             }

        }else if (ae.getSource() ==cancel){
            setVisible(false);
        };
    }

    public static void main(String[] args) {
        new login();
    }
}
