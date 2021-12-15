package com.StudentFeedback;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class myFeedbackForm extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;


    public myFeedbackForm(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 697);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel lblStudentForm = new JLabel("My Feedback Form");
        lblStudentForm.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        lblStudentForm.setBounds(362, 52, 325, 50);
        contentPane.add(lblStudentForm);

        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblusername.setBounds(58, 152, 99, 43);
        contentPane.add(lblusername);

        JLabel lblsubject = new JLabel("Subject");
        lblsubject.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblsubject.setBounds(58, 212, 99, 43);
        contentPane.add(lblsubject);

        JLabel lblcomment= new JLabel("Comments");
        lblcomment.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblcomment.setBounds(58,272,99,43);
        contentPane.add(lblcomment);

        JLabel lblimprovement= new JLabel("Improvement");
        lblimprovement.setFont(new Font("Tahoma",Font.PLAIN,17));
        lblimprovement.setBounds(58,372,99,43);
        contentPane.add(lblimprovement);
    }
}
