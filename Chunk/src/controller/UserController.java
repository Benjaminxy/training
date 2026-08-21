package controller;

import java.util.Scanner;

import model.User;
import service.UserService;


public class UserController {
Scanner input = new Scanner(System.in);
 UserService userService = new UserService();

       public void generalMenu() {
        System.out.println("*** Hello and Welcome ***");
        System.out.println("1-signIn:");
        System.out.println("2-signUp:");
        System.out.println("3-Exit:");
        System.out.println("Please enter a number:");
        int userInput = input.nextInt();
        input.nextLine();
        switch (userInput) {
            case 1 -> signIn();
            case 2 -> signUp();
            case 3 -> {
                System.out.println("Good by!");
                System.exit(0);
            }
        }
    }



public void signUp () {

    System.out.println("please enter your Name");

        
        String name = input.nextLine();
        System.out.println("please enter your Username");
       String  username = input.nextLine();

        System.out.println("please enter your password");

        String password = input.nextLine();

         int result = userService.signUp(new User(name, username, password));

        if (result ==-2) {

            System.out.println("The username already exists, try again");

        } else if (result == -1){

            System.out.println("No available space left in the array!");
        }else {
            System.out.println("Done");
        }

    } 



     public void signIn() {

     
    System.out.println("please enter your Username for sign in");
    String username = input.nextLine();
    System.out.println("please enter your password for sign in");
     String  password = input.nextLine();

       String result1 = userService.signIn(username, password);
           
            if (result1 != null) {
                System.out.println( "hello " + result1);

            } else {
                System.out.println("User not found");
            }

            }

}
