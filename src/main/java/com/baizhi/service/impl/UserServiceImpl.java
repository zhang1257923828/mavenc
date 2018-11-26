package com.baizhi.service.impl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public void deleteMany(int[] ids) {
        userDao.deleteMany(ids);

    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User selectOne(int id) {
        return userDao.selectOne(id);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public List<User> getUserByPage(int start, int end, String name) {
        return null;
    }

    @Override
    public int getCount(String name) {
        return 0;
    }
}
