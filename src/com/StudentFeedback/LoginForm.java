package com.StudentFeedback;

/**
 * importing the java Swing libraries
 */

import login.Interface.LoginInterface;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.*;


import javax.swing.border.EmptyBorder;

public class LoginForm extends JFrame {

    /**
     * component of the form
     */
    private static final long serialVersionUID = 1L;
    private JTextField username;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JLabel label;
    private JPanel contentPane;

    /**
     *  constructor, to initialize the component with values
     */
    public LoginForm() {
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

        JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 13, 273, 93);
        contentPane.add(lblNewLabel);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(481, 170, 281, 68);
        contentPane.add(username);
        username.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(481, 286, 281, 68);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblUsername.setBounds(250, 166, 193, 52);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblPassword.setBounds(250, 286, 193, 52);
        contentPane.add(lblPassword);

        btnNewButton = new JButton("Login");
       btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 392, 162, 73);
        btnNewButton.addActionListener(new ActionListener() {

            /**
             * method actionperformed()
             * @param e
             * action will performed accordingly
             */
            public void actionPerformed(ActionEvent e){
                boolean fal= false;
                try {
                    Registry regs= LocateRegistry.getRegistry("127.0.0.1",52365);
                    LoginInterface li = (LoginInterface)regs.lookup("Login");
                    fal= li.getLogin(username.getText(),passwordField.getText());
                    if( fal=true){
                        JOptionPane.showMessageDialog(null, "Login successfull");
//                        RegistrationForm regframe= new RegistrationForm();
//                        regframe.setVisible(true);


                    }else{
                        JOptionPane.showMessageDialog(null,"Login Failed ");
                    }

                }
                catch(Exception ex ){
                    ex.printStackTrace();
                }




            }

        });

        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(250, 447, 259, 74);
        contentPane.add(btnNewButton);


        btnNewButton =new JButton("Sign up");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 392, 162, 73);
        btnNewButton.addActionListener(new ActionListener() {

            /**
             * method actionperformed()
             * @param e
             * action will performed accordingly
             */
            public void actionPerformed(ActionEvent e){

//StudentFeedbackForm std = new StudentFeedbackForm();
//std.setVisible(true);

RegistrationForm regs= new RegistrationForm();
regs.setVisible(true);


            }

        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(550, 447, 259, 74);
        contentPane.add(btnNewButton);



    }
    }