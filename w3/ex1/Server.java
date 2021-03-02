import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Server
 */
public class Server {

    public Server(){}
    public static void main(String[] args) {
        try {
            int index=0;
            int port=Integer.parseInt(args[index++]);

            ImplHello obj=new ImplHello();

            Hello skeleton=(Hello) UnicastRemoteObject.exportObject(obj,0);

            Registry registry=LocateRegistry.getRegistry(port);
            registry.rebind("Hello", skeleton);
            System.err.println("Server ready\n");
        } catch (Exception e) {
            //TODO: handle exception
            System.err.print(e.toString());
        }
    }
}