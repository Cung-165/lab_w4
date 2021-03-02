import java.util.ArrayList;

import DAO.IUser_DAO;
import DAO.User_DAO;
import model.User_model;

public class test {
    public static void main(String[] args) {
        IUser_DAO aIUser_DAO = new User_DAO();
        ArrayList<User_model> list = aIUser_DAO.getByName("WILSON");
        for (User_model user_model : list) {
            System.out.println(user_model);
        }
    }
}
