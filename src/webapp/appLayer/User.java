package webapp.appLayer;

public class User {

    public boolean isValidUserCredentials(String sUserName, String sUserPassword){
        return sUserName.equals("carolyn") && sUserPassword.equals("");
    }
}
