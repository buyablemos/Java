package org.backend;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;


    User(String username, String passwordHash){

        this.username = username;
        this.passwordHash = passwordHash;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
    public String getUsername() {
        return username;
    }
}
