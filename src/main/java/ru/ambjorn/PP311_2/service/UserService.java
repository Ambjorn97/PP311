package ru.ambjorn.PP311_2.service;



import ru.ambjorn.PP311_2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User getUserById(int id);
}
