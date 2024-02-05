package com.Boppo.Java_Boppo.Controller;

import com.Boppo.Java_Boppo.Data.User;
import com.Boppo.Java_Boppo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(path="/users")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }
    @PostMapping(path="/users")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @PutMapping(path="/users/{id}")
    public User updateUser(@RequestBody User user, @PathVariable(name = "id") String id){
        user.setId(id);
        userService.updateUser(user);
        return user;
    }
    @DeleteMapping(path="/users/{id}")
    public void deleteUserById(@PathVariable String id){
        userService.deleteUserById(id);
    }

    @GetMapping("/U_Login")
    public ResponseEntity<Boolean> checkUserByUsernameAndPassword(@RequestParam String Username, @RequestParam String Password) {
        boolean exists = userService.checkUserByUsernameAndPassword(Username, Password);
        return ResponseEntity.ok(exists);
    }

    @GetMapping("/E_Login")
    public ResponseEntity<Boolean> checkUserByEmailAndPassword(@RequestParam String Email, @RequestParam String Password) {
        boolean exists = userService.checkUserByEmailAndPassword(Email, Password);
        return ResponseEntity.ok(exists);
    }
}