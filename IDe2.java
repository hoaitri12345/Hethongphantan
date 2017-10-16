import java.rmi.*;

public interface IDe2 extends Remote
{
    public String getGreetingMessage(String args []) throws RemoteException;
}