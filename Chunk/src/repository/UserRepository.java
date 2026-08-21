package repository;

import model.User;

public class UserRepository {

     private  final User[] USERS = new User[10];

     public UserRepository () {
        USERS[0]= new User("karim" , "karimi" ,"karims");

     }

public boolean isDuplicateUsername (String username)

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
    public User findUsername (String username){

        for (int i = 0; i < USERS.length; i++) 
            {
                if (USERS[i] != null && USERS[i].getUsername().equals(username) )
                {
                    return USERS[i];
                
                   
                }
            
        }
         return null;


    }
}
