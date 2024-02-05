package com.Boppo.Java_Boppo.Service;

import com.Boppo.Java_Boppo.Data.User;
import com.Boppo.Java_Boppo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUser(){
        List<User> user = userRepository.findAll();
        return user;
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public User updateUser(User user){
        return userRepository.save(user);
    }
    public void deleteUserById(String id){
        userRepository.deleteById(id);
    }

    public boolean checkUserByUsernameAndPassword(String username, String password){
        return userRepository.existsByUsernameAndPassword(username, password);
    }

    public boolean checkUserByEmailAndPassword(String email, String password) {
        return userRepository.existsByEmailAndPassword(email, password);
    }
}
