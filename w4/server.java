import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class server {
    public server() {
    }

    public static void main(String[] args) {
        try {
            int index = 0;
            int port = Integer.parseInt(args[index++]);

            RoomManagerImp roomManagerImp = new RoomManagerImp();

            RoomManager skeleton = (RoomManager) UnicastRemoteObject.exportObject(roomManagerImp, 0);

            Registry registry = LocateRegistry.getRegistry(port);
            registry.rebind("Manager", skeleton);
            System.out.println("Server running....");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
