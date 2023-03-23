package com.example.userregisteration;
import java.util.ArrayList;

public class UserStorage {


    private ArrayList<User> users = new ArrayList<>();

    private static UserStorage userStorage = null;

    private UserStorage(){
    }

    public static UserStorage getInstance(){
        if(userStorage == null){
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public int addUser(User user){
        users.add(user);
        return(0);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
