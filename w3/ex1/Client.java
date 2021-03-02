import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Client
 */
public class Client {
    public Client(){}
    public static void main(String[] args) {
        try {
            if(args.length != 3){
                System.err.print("usage: java Client host port input");
                System.exit(1);
            }
            int index=0;
            String host=args[index++];
            int port=Integer.parseInt(args[index++]);
            String input=args[index++];
          

            Registry registry=LocateRegistry.getRegistry(host,port);

            Hello stub=(Hello) registry.lookup("Hello");
            stub.printMsg(input);
            System.err.print("Remote method invoked");
        } catch (Exception e) {
            //TODO: handle exception
            System.err.print(e.toString());
        }
    }
    
}