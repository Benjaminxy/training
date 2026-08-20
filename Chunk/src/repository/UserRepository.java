package repository;

import jak.User;

public class UserRepository {

     private  final User[] USERS = new User[10];

public boolean isDoublicateUsername (String username)

{

      for (int i = 0; i < USERS.length; i++) {

            if (USERS[i] != null &&
                    USERS[i].getUsername().equals(username)) {

                return true;
            }
        }
        return false;

}

public  int signUp(User users) {

        

        for (int i = 0; i < USERS.length; i++) {

            if (USERS[i] == null) {

                USERS[i] = users;
                return i;
            }
        }

        return -1;
    }

}
