import java.rmi.RemoteException;

/**
 * Cal
 */
public class Cal implements ICal{

    
    
    @Override
    public Long add(Long a, Long b) throws RemoteException {
        return a+b;
    }

    @Override
    public Long sub(Long a, Long b) throws RemoteException {
        return a-b;
    }
}