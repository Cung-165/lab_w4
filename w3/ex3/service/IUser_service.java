package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import model.*;

public interface IUser_service extends Remote {
    ArrayList<User_model> getAll() throws RemoteException;

    ArrayList<User_model> getByName(String name) throws RemoteException;

    ArrayList<User_model> getByPctWhite(double number) throws RemoteException;

    ArrayList<User_model> getByCount(int number) throws RemoteException;

}
