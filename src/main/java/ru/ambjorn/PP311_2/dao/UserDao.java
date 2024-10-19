package ru.ambjorn.PP311_2.dao;



import ru.ambjorn.PP311_2.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User getUserById(int id);
}
