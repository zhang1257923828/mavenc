package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    public List<User> selectAll();
    public void insert(User user);
    public void deleteMany(int[] ids);
    public void update(User user);
    public User selectOne(int id);
    public void delete(int id);
    public List<User> getUserByPage(@Param("start") int start, @Param("end") int end, @Param("name")String name);
    public int getCount(@Param("name") String naem);
}
