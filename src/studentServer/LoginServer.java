package studentServer;


import login.Implement.LoginImplement;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class LoginServer {
public static void main (String[] args){
    try{
        Registry regs = LocateRegistry.createRegistry(52365);
        LoginImplement loginimp = new LoginImplement();
        regs.rebind("loginForm", loginimp);

        System.out.println("server is ready");

    }catch(Exception e){
        e.printStackTrace();
    }



}

}
