package Accounts;

public class User {
    protected String username;
    protected int id;
    protected String password;

    public User( String username, String password) {
        this.username = username;
        this.password = password;
        this.id = Math.abs(username.hashCode());
    }
    public String getUsername() {
        return username;
    }
    public int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String toString() {
        return "Username: " + username + "\nID: #" + id;
    }
    public int eq(User user){
        return this.username.compareTo(user.getUsername());
    }
}
