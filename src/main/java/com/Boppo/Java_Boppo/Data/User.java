package com.Boppo.Java_Boppo.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    @Id
    @Indexed(unique = true)
    private String id;
    @Indexed(unique = true)
    private String Username;
    @Indexed(unique = true)
    private String Email;

    private String Password;

    public User(String id, String Username, String Email, String password) {
        this.id = id;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
