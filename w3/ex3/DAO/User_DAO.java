package DAO;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.User_model;

public class User_DAO implements IUser_DAO {

    @Override
    public ArrayList<User_model> getAll() {
        ArrayList<User_model> List_user = new ArrayList<>();
        // TODO Auto-generated method stub
        try {

            String line = "";
            String splitBy = ",";
            BufferedReader bReader = new BufferedReader(new FileReader("./Data/app_c_new.csv"));

            while ((line = bReader.readLine()) != null) {
                String[] User = line.split(splitBy);
                if (User[0].equals("name")) {
                    continue;
                }

                User_model user_model = new User_model();
                user_model.setName(User[0]);
                user_model.setCount((int) Integer.parseInt(User[1]));
                user_model.setPctwhite((double) Double.parseDouble(User[2]));
                user_model.setPctblack((double) Double.parseDouble(User[3]));
                // System.out.println(user_model);
                List_user.add(user_model);

            }
            // for (User_model user_model : List_user) {
            // System.out.println(user_model);
            // }
            return List_user;

        } catch (FileNotFoundException e) {

            e.printStackTrace();
            return null;
        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }

    }

    @Override
    public ArrayList<User_model> getByName(String name) {
        System.out.println(name);
        ArrayList<User_model> all = getAll();
        ArrayList<User_model> user_byName = new ArrayList<>();
        for (User_model user_model : all) {
            if (user_model.getName().equals(name)) {
                user_byName.add(user_model);
            }

        }
        return user_byName;
    }

    @Override
    public ArrayList<User_model> getByPctWhite(double number) {
        ArrayList<User_model> all = getAll();
        ArrayList<User_model> user_byPctWhite = new ArrayList<>();
        for (User_model user_model : all) {
            double userpctWhite = user_model.getPctwhite();
            if (userpctWhite < number) {
                user_byPctWhite.add(user_model);
            }

        }
        return user_byPctWhite;

    }

    @Override
    public ArrayList<User_model> getByCount(int number) {
        // TODO Auto-generated method stub

        ArrayList<User_model> all_users = getAll();
        ArrayList<User_model> user_models = new ArrayList<>();
        for (User_model user_model : all_users) {
            int user_count = user_model.getCount();

            if (user_count > number) {
                user_models.add(user_model);
            }
        }
        return user_models;
    }

}
