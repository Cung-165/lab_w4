package DAO;

import java.util.ArrayList;

import model.User_model;

public interface IUser_DAO {
    ArrayList<User_model> getAll();

    ArrayList<User_model> getByName(String name);

    ArrayList<User_model> getByPctWhite(double number);

    ArrayList<User_model> getByCount(int number);
}
