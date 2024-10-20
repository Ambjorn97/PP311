package ru.ambjorn.PP311_2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ambjorn.PP311_2.dao.UserDao;
import ru.ambjorn.PP311_2.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
