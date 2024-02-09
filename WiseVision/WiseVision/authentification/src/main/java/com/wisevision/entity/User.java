package com.wisevision.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Getter
@Setter
public class User {

    @Id
    private String userName;

    private String userFirstName;

    private String userLastName;

    private String userEmail;

    private String userPassword;

    private String Store;

    private UserRole userRole;

    public enum UserRole {
        ADMIN,
        USER
    }
}
