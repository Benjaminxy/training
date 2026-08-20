package jak;

public class User {

    private String username;
    private String password;
    private String something;

    public User(String username, String password, String something) {
        this.username = username;
        this.password = password;
        this.something = something;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}