package jak;

import java.util.*;

import service.UserService;

public class Main {

   

    public static void main(String[] agrs) {

        UserService userService = new UserService();

   
    Scanner input = new Scanner(System.in);


    
      
        System.out.println("please enter your Name");

        
        String name = input.nextLine();
        System.out.println("please enter your Username");
        input = new Scanner(System.in);
       String  username = input.nextLine();

        System.out.println("please enter your password");

        input = new Scanner(System.in);
        String password = input.nextLine();

         int result = userService.signUp(new User(name, username, password));

        if (result ==-2) {

            System.out.println("The usename exist try again");

        } else if (result == -1){

            System.out.println("Array dont have any index!");
        }else {
            System.out.println("Done");
        }

      

        //sign in 
   /*     User user = null;
        while (user == null) {

            System.out.println("please enter your Username for sign in");
            input = new Scanner(System.in);
            username = input.nextLine();

            System.out.println("please enter your password for sinm in");

            input = new Scanner(System.in);
            password = input.nextLine();

            user = signIn(username, password);
            if (user != null) {
                System.out.println(user);

            } else {
                System.out.println("user is not found");
            }
        }

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

     */
}
}