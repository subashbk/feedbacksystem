package com.StudentFeedback;

/**
 * importing the java Swing libraries
 */
import java.awt.EventQueue;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.security.auth.login.LoginContext;
import javax.swing.*;
//import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;


public class StudentFeedbackForm extends JFrame{

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField Username;
    private JTextField subject;
    private JTextField comments;
    private JTextField improvement;
    private JButton btnsubmit;

    private JButton btnSubmit;


    public StudentFeedbackForm(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 697);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel lblStudentForm = new JLabel("Student Feedback Form");
        lblStudentForm.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        lblStudentForm.setBounds(362, 52, 325, 50);
        contentPane.add(lblStudentForm);

        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblusername.setBounds(58, 152, 99, 43);
        contentPane.add(lblusername);

        Username = new JTextField();
        Username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        Username.setBounds(500, 151, 228, 50);
        contentPane.add(Username);


        JLabel lblsubject = new JLabel("Subject");
        lblsubject.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblsubject.setBounds(58, 212, 99, 43);
        contentPane.add(lblsubject);

        subject= new JTextField();
        subject.setFont(new Font("Tahoma", Font.PLAIN, 32));
        subject.setBounds(500,212,228,50);
        contentPane.add(subject);



        JLabel lblcomment= new JLabel("Comment");
        lblcomment.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblcomment.setBounds(58,272,99,43);
        contentPane.add(lblcomment);

        comments = new JTextField();
        comments.setFont(new Font("Tahoma",Font.PLAIN,32));
        comments.setBounds(500,272,228,75);
        contentPane.add(comments);



        JLabel lblimprovement= new JLabel("Improvement");
        lblimprovement.setFont(new Font("Tahoma",Font.PLAIN,17));
        lblimprovement.setBounds(58,372,99,43);
        contentPane.add(lblimprovement);

        improvement= new JTextField();
        improvement.setFont(new Font("Tahoma",Font.PLAIN,32));
        improvement.setBounds(500,372,228,80);
        contentPane.add(improvement);



        btnsubmit = new JButton("Submit ");
        btnsubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){





//myFeedbackForm myfeed= new myFeedbackForm();
//myfeed.setVisible(true);

            }

        });


        btnsubmit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnsubmit.setBounds(400, 500, 259, 74);
        contentPane.add(btnsubmit);





    }
}
