package com.StudentFeedback;
import com.sun.deploy.security.SelectableSecurityManager;
import databaseconnection.dbConnection;
/**
 * importing the java Swing libraries
 */
import java.awt.EventQueue;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;


import javax.security.auth.login.LoginContext;
import javax.swing.*;
//import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

public class RegistrationForm extends JFrame {
    /**
     * component of the form
     */

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtfirstname;
    private JTextField txtlastname;
    private JTextField txtemail;
    private JTextField txtusername;
    private JTextField txtcpassword;
    private JPasswordField txtpassword;
    private JButton btnNewButton;
//    public static void main(String[] args) {
//        // write your code here
//
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                   // LoginForm frame = new LoginForm();
//                    //frame.setVisible(true);
//                    RegistrationForm  regframe= new RegistrationForm();
//
//                    regframe.setVisible(true);
//
//
//                    // StudentFeedback stdframe = new StudentFeedback();
//                    // stdframe.setVisible(true);
//                    //Admin admin =new Admin();
//                   // admin.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
    /**
     *  constructor, to initialize the component with values
     */

    public RegistrationForm() {


        /**
         * Create the frame.
         */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        txtfirstname = new JTextField();
        txtfirstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        txtfirstname.setBounds(214, 151, 228, 50);
        contentPane.add(txtfirstname);
        txtfirstname.setColumns(10);

        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 243, 110, 29);
        contentPane.add(lblNewLabel);

        txtlastname = new JTextField();
        txtlastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        txtlastname.setBounds(214, 235, 228, 50);
        contentPane.add(txtlastname);
        txtlastname.setColumns(10);

        JLabel lblEmailAddress = new JLabel("Email");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);





        txtemail = new JTextField();
        txtemail.setFont(new Font("Tahoma", Font.PLAIN, 32));
        txtemail.setBounds(214, 320, 228, 50);
        contentPane.add(txtemail);
        txtemail.setColumns(10);



        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        txtusername = new JTextField();
        txtusername.setFont(new Font("Tahoma", Font.PLAIN, 32));
        txtusername.setBounds(707, 151, 228, 50);
        contentPane.add(txtusername);
        txtusername.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 245, 99, 24);
        contentPane.add(lblPassword);

        txtpassword = new JPasswordField();
        txtpassword.setFont(new Font("Tahoma", Font.PLAIN, 32));
        txtpassword.setBounds(707, 235, 228, 50);
        contentPane.add(txtpassword);


        JLabel lblpassword = new JLabel("Confirm Password");
        lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblpassword.setBounds(542, 329, 139, 26);
        contentPane.add(lblpassword);

        txtcpassword= new JTextField();
        txtcpassword.setFont(new Font("Tahoma", Font.PLAIN, 32));
        txtcpassword.setBounds(707, 320, 228, 50);
        contentPane.add(txtcpassword);
        txtcpassword.setColumns(10);



        btnNewButton = new JButton("Register");
          btnNewButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {

                   if (txtfirstname.getText().isEmpty() || txtlastname.getText().isEmpty() || txtemail.getText().isEmpty() || txtusername.getText().isEmpty()||
                   txtpassword.getText().isEmpty()||txtcpassword.getText().isEmpty());{
                       JOptionPane.showMessageDialog(null,"All fields are mendatory");
                   }
                   else

                       {
                           if (txtpassword.getText().equals(txtcpassword.getText())){

                               String Firstname = txtfirstname.getText();

                               String LastName = txtlastname.getText();
                               String Email = txtemail.getText();
                               String Username =txtusername.getText();
                               String Password = txtpassword.getText();
                               String Cpassword = txtcpassword.getText();


                               String message =""+ txtfirstname;

                           }

                   }
                   else
                       {
                       JOptionPane.showMessageDialog(null,"Password  and confirm password did not match");
                   }

               }

              {

                   //message+="\n";



//                   try{
//String query= "INSERT into registrationform values ('\" + firstName + \"','\" + lastName + \"','\" + email+ \"','\" +\n" +
//        "                        username + \"','\" + password + \"','\" + confirmpass + \"')";
//
//
//
//                   }



myFeedbackForm my= new myFeedbackForm();
my.setVisible(true
);


               }

               });


        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 447, 259, 74);
        contentPane.add(btnNewButton);

    }
}