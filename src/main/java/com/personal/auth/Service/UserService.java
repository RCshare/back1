package com.personal.auth.Service;

import com.personal.auth.Entity.User;
import com.personal.auth.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public boolean isValidCredentials(String name, String password){
        List<User> userList = userRepository.findAll();

        Optional<User> user = userRepository.findByName(name);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return true;
        }
        return false;
    }

}
