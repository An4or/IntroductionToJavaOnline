package by.yakovtsev.introduction.tasks_6.task1.model;

import org.mindrot.jbcrypt.BCrypt;

public class User {

    private String login;
    private String email;
    private String passwordHash;
    private boolean admin;
    private boolean logged;

    public User(String login, String email, String passwordHash, boolean admin) {

        setLogin(login);
        setEmail(email);
        setPassword(passwordHash);
        this.admin = admin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isLogged() {
        return logged;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean login(String login, String password) {
        if (this.login.equals(login) && BCrypt.checkpw(password, this.passwordHash)) {
            logged = true;
        }
        return logged;
    }

    public void logout() {
        logged = false;
    }

    public boolean isAdmin() {
        return admin;
    }

    @Override
    public String toString() {
        return login + '\n' +
                email + "\n" +
                passwordHash + "\n" +
                (isAdmin() ? "y" : "n") + "\n";
    }
}
