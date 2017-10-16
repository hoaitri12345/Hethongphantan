import java.rmi.*;
import java.rmi.server.*;

public class De2Implementation extends UnicastRemoteObject
        implements IDe2 
{

        public static int USCLN(int x, int y) 
        {
                 if(x < 0)
           x = -x;
          if(y < 0)
           y = -y;
          if (x == 0 && y == 0)
           return -1;
          else 
          {
           while (x!= 0 && y!= 0)
           {
            if(x > y)
             x = x%y;
            else
             y = y%x;
           }
           if (x == 0)
           return x; 
           else
            return y; 
         }  
        
    }
 public static int BCNN(int x, int y)
 {
              return x*y / USCLN(x,y);
       }

    public De2Implementation() throws RemoteException 
    {
        //There is no action need in this moment.
    }
    
    @Override
    public String getGreetingMessage(String args[]) throws RemoteException 
    {
       String S=" ";
       int x= Integer.parseInt(args[0]);
        int y= Integer.parseInt(args[1]);
        	if( USCLN(x,y) == -1) {
                S="Ket qua khong co";
            }
            else
            {
                S = "USCLN =" + USCLN(x,y) +"BCNN =" + BCNN(x,y);
            }
        return S;
    }
}
