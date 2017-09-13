package appLayer;

import dataLayer.DBuser;
import webapp.todo;

import java.util.ArrayList;

public class User {
    private DBuser db_User = new DBuser();
    public boolean isValidUserCredentials(String sUserName, String sUserPassword){

        return db_User.isValidUserLogin(sUserName,sUserPassword);
    }
    public ArrayList<todo> getTodoUser(){
        return db_User.getTodo();
    }
    public void setTodo(todo newItem){
        db_User.setTodo(newItem);
    }
}
