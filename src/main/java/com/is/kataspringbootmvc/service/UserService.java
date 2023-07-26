package com.is.kataspringbootmvc.service;

import com.is.kataspringbootmvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(int id);
    void saveUser(User user);
    void updateUser(int id, User user);
    void deleteUser(int id);
}
