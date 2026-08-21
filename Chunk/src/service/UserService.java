package service;


import  jak.User;

import repository.UserRepository;

public class UserService {

    public final UserRepository userRepository = new UserRepository();

    public int signUp (User user)
    {

        Boolean isDublicateUsername = userRepository.isDoublicateUsername(user.getUsername());

        if (isDublicateUsername) {
            return -2 ;
        }
      return userRepository.signUp(user) ;

    }

}
