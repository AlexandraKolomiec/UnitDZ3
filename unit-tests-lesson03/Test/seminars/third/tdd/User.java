package seminars.third.tdd;

public class User {
    String login;
    String password;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public boolean authmethod(String loginUser, String passwordUser) {
        if(login.equals(loginUser)&&password.equals(passwordUser)) {
            return true;
        }
        else {
            return false;
        }

    }
}
