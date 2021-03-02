import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICal extends Remote{
    public Long add(Long a,Long b) throws RemoteException;
    public Long sub(Long a,Long b) throws RemoteException;
}