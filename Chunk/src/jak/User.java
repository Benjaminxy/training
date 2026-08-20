package jak;

public class User {

    private String username;
    private String password;
    private String name;

    public User(String name,  String username, String password) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}