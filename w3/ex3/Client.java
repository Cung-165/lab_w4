import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

import model.User_model;
import service.IUser_service;

@SuppressWarnings("unchecked")
public class Client {
    public Client() {
    }

    public static void main(String[] args) throws Exception {
        try {
            if (args.length != 4) {
                System.err.println("Error for input");
            }
            int index = 0;
            String host = args[index++];
            int port = (int) Integer.parseInt(args[index++]);
            String funtion = args[index++];
            String parameter = args[index++];

            Registry registry = LocateRegistry.getRegistry(host, port);

            IUser_service stub = (IUser_service) registry.lookup("IUser");

            if (funtion.equals("find")) {

                ArrayList<User_model> list_user = stub.getByName(parameter);

                if (list_user.size() == 0) {
                    System.out.println("User not exist");
                }
                for (User_model user_model : list_user) {
                    System.out.println(user_model);
                }
            } else if (funtion.equals("pctwhite")) {
                String numbeString = parameter.replace(',', '.');
                double number = (double) Double.parseDouble(numbeString);
                ArrayList<User_model> list_user = stub.getByPctWhite(number);
                if (list_user.size() == 0) {
                    System.out.println("User not exist");
                }
                for (User_model user_model : list_user) {
                    System.out.println(user_model);
                }
            } else if (funtion.equals("list")) {
                int number = (int) Integer.parseInt(parameter);
                ArrayList<User_model> list_user = stub.getByCount(number);
                if (list_user.size() == 0) {
                    System.out.println("User not exist");
                }
                for (User_model user_model : list_user) {
                    System.out.println(user_model);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
