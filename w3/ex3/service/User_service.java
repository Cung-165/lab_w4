package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import DAO.IUser_DAO;
import DAO.User_DAO;
import model.User_model;

public class User_service implements IUser_service {

    IUser_DAO user_dao;

    public User_service() {
        this.user_dao = new User_DAO();
    }

    @Override
    public ArrayList<User_model> getAll() {

        return user_dao.getAll();
    }

    @Override
    public ArrayList<User_model> getByName(String name) {

        return user_dao.getByName(name);
    }

    @Override
    public ArrayList<User_model> getByPctWhite(double number) {
        // TODO Auto-generated method stub
        return user_dao.getByPctWhite(number);
    }

    @Override
    public ArrayList<User_model> getByCount(int number) {
        // TODO Auto-generated method stub
        return user_dao.getByCount(number);
    }

}
