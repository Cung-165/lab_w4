import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import service.IUser_service;
import service.User_service;

public class Server {
    public Server() {
    }

    public static void main(String[] args) {

        try {
            int index = 0;
            int port = Integer.parseInt(args[index++]);

            User_service user_service = new User_service();

            IUser_service skeleton = (IUser_service) UnicastRemoteObject.exportObject(user_service, 0);
            Registry registry = LocateRegistry.getRegistry(port);
            registry.rebind("IUser", skeleton);
            System.out.println("server running....");

        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
