package login.Implement;


import login.Interface.LoginInterface;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;


public class LoginImplement extends UnicastRemoteObject implements LoginInterface {

    public LoginImplement() throws RemoteException{

    }

    @Override
    public boolean getLogin(String username, String password) throws RemoteException {
        boolean found =false;
        try{
            if( username.equals("admin" )&& password.equals("123")){
                return found=true;
            }else
            {
                return found=false;
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
        return found;
    }
}
