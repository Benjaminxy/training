package service;


import model.User;
import repository.UserRepository;

public class UserService {

    public final UserRepository userRepository = new UserRepository();

    public int signUp (User user)
    {

        Boolean isDuplicateUsername = userRepository.isDuplicateUsername(user.getUsername());

        if (isDuplicateUsername) {
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
