package com.StudentFeedback;

import studentServer.LoginServer;

import java.awt.*;

public class Main {
    /**
     * this is main class whih contains main method
     * this class will invoke required method.
     * Launch the application.
     */

    public static void main(String[] args) {
	// write your code here

            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        LoginForm frame = new LoginForm();
                        frame.setVisible(true);




                       //RegistrationForm  regframe= new RegistrationForm();

                      // regframe.setVisible(true);


                       // StudentFeedback stdframe = new StudentFeedback();
                       // stdframe.setVisible(true);
                        //Admin admin =new Admin();
                        //admin.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } }

