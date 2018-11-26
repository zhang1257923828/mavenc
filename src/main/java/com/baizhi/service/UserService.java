package com.baizhi.service;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    public List<User> selectAll();
    public void insert(User user);
    public void deleteMany(int[] ids);
    public void update(User user);
    public User selectOne(int id);
    public void delete(int id);
    public List<User> getUserByPage(int start,int end,String name);
    public int getCount(@Param("name") String name);
}
