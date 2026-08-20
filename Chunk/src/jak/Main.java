package jak;

public class Main {

    private static final User[] USERS = new User[10];

    public static void main(String[] agrs) {

        Boolean result = signUp(new User("benjamin", "test1234", "test"));

        signUp(new User("benjamin", "test1234", "test"));

        if (!result) {

            System.out.println("The usename exist try again");

        } else {

            System.out.println("Done!");
        }

        User user = signIn("benjamin", "test1234");
        if(user!=null) {
            System.out.println(user);

        }else{
            System.out.println("user is not found");
        }

        

    }

    public static boolean signUp(User users) {

        for (int i = 0; i < USERS.length; i++) {

            if (USERS[i] != null &&
                USERS[i].getUsername().equals(users.getUsername())) {

                return false;
            }
        }

        for (int i = 0; i < USERS.length; i++) {

            if (USERS[i] == null) {

                USERS[i] = users;
                return true;
            }
        }

        return true;
    }

    public static User signIn(String username, String password) {

        for (int i = 0; i < USERS.length; i++) {

            if (USERS[i] != null &&
                USERS[i].getUsername().equals(username)) {

                if (USERS[i].getPassword().equals(password)) {

                    return USERS[i];

                } else {

                    return null;
                }
            }
        }

        return null;
    }
}