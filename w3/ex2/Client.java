import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 * Client
 */
public class Client {

    public Client(){}
    public static void main(String[] args) {
       try{
        if(args.length !=4){
            System.err.print("Your input is not correct");
            System.exit(1);
        }
        int index=0;
        String host=args[index++];
        int port=Integer.parseInt(args[index++]);
        Long a=Long.parseLong(args[index++]);
        Long b=Long.parseLong(args[index++]);

        Registry registry=LocateRegistry.getRegistry(host,port);

        ICal stub=(ICal) registry.lookup("ICal");

        System.out.print("Add: "+stub.add(a,b));
        System.out.print("Sub: "+stub.sub(a,b));

    
       }
       catch(Exception e){

            System.err.print(e.toString());
       }
    }
}