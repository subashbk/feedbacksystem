package login.Interface;
import java.rmi.*;

public interface LoginInterface extends Remote {
    public boolean getLogin(String username,String passwordField) throws RemoteException;

}
