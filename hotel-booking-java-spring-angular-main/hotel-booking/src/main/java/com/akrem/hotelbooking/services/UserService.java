package com.akrem.hotelbooking.services;

import com.akrem.hotelbooking.models.User;
import com.akrem.hotelbooking.models.UserRole;

import java.util.List;

public interface UserService {
    User saveUser (User user);
    UserRole saveUserRole (UserRole userRole);
    void addUserRoleToUser(String userName, String userRoleName);
    User getUser(String UserName);
    List<User> getUsers();
}
