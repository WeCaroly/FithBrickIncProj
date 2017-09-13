package appLayer;

import dataLayer.DBuser;

public class User {

    public boolean isValidUserCredentials(String sUserName, String sUserPassword){

        DBuser db_User = new DBuser();
        return db_User.isValidUserLogin(sUserName,sUserPassword);
    }
}
