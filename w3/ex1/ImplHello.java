import java.rmi.RemoteException;

public class ImplHello implements Hello{
    @Override
    public void printMsg(String name) throws RemoteException {
        System.out.print(name+" is try to contact");
    }
}