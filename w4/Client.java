import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                System.err.println("Error for input");
            }
            int index = 0;
            String host = args[index++];
            int port = (int) Integer.parseInt(args[index++]);
            String function = args[index++];

            Registry registry = LocateRegistry.getRegistry(host, port);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
