package com.is.kataspringbootmvc.dao;

import com.is.kataspringbootmvc.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    User getUserById(int id);
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(int id, User user);
}
