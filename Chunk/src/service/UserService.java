package service;


import  jak.User;

import repository.UserRepository;

public class UserService {

    public final UserRepository userRepository = new UserRepository();

    public int signUp (User user)
    {

        Boolean isDublicateUsername = userRepository.isDoublicateUsername(user.getUsername());

        if (isDublicateUsername) {
            return -2  ;
        }
      return userRepository.signUp(user) ;
 
    }

    public String signIn(String username ,String password ) {

        User byUsername = userRepository.findUsername(username);
        if (byUsername== null||!byUsername.getPassword().equals(password) ){
            return null;

        }else {

                return byUsername.getUsername();
        }

    }

}
