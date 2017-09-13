package dataLayer;

import webapp.todo;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.sql.*;
import java.util.ArrayList;

public class DBuser {

    //JDB driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    static final String DB_URL = "jdbc:mysql://localhost/webbapplogin";

    private static final String USER = "webappuser";
    static final String PASS = "password";

    public boolean isValidUserLogin(String sUsername, String sPassowrd){
        boolean isValid = false;

        Connection con = null;
        Statement stmt = null;
        String sql;

        //look up in dataBase

            //step 2 register JDBC driver
            try {
                Class.forName(JDBC_DRIVER);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try{//step 3 open connection

            System.out.print("Connecting to db....");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("creating statement.... ");
            stmt = con.createStatement();

            sql = "SELECT * FROM users WHERE username = \"" + sUsername
                    + "\" AND password = \"" + sPassowrd+ "\"" ;
            //System.out.print(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //step 5 extract data from result set
            if(rs.next()){
                isValid = true;
            }
            //step 6 close up db
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //use to close
            try{
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("closed the DB!");
        return isValid;
    }
    public ArrayList<todo> getTodo(){
        Connection con = null;
        Statement stmt = null;
        String sql;
        ArrayList<todo> list = new ArrayList<todo>();
        //look up in dataBase

        //step 2 register JDBC driver
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{//step 3 open connection

            System.out.print("\nConnecting to db....");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("\ncreating statement.... ");
            stmt = con.createStatement();

            sql = "SELECT * FROM todo";
            //System.out.print(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //step 5 extract data from result set

            while (rs.next()) {
                todo newItem = new todo();
                String id = rs.getString("id");
                String todo = rs.getString("TODO");
                String user = rs.getString("user");
                newItem.setTodo(id);
                newItem.setTodo(todo);
                newItem.setUser(user);
                list.add(newItem);
                System.out.print(newItem.getTodo()+ " = " + newItem.getUser());
            }

            //step 6 close up db
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //use to close
            try{
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\nclosed the DB!");
        return list;
    }

    public void setTodo(todo newItem) {
        Connection con = null;
        Statement stmt = null;
        String sql;
        ArrayList<todo> list = new ArrayList<todo>();
        //look up in dataBase

        //step 2 register JDBC driver
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {//step 3 open connection

            System.out.print("\nConnecting to db....");
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            //step 4
            System.out.print("\ncreating statement.... \n");
            stmt = con.createStatement();

            String todoItem = newItem.getTodo();
            String userItem = newItem.getUser();
            if (userItem == null) userItem = "carolyn";
            if(todoItem != null ) {
                //sql = "INSERT INTO todo (TODO, user) VALUES (" + todoItem + "," + userItem + ");";
                sql = "INSERT INTO todo (TODO, user) VALUES (\'"+ todoItem +"\',\'"+ userItem +"\');";
                System.out.println(sql);
                int rs = stmt.executeUpdate(sql);
        }
           //step 5 close up db

            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //use to close
            try {
                if (stmt != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\nclosed the DB!");
    }

}
