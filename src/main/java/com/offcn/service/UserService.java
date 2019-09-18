package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

public interface UserService {

    public void add(User user);

    public void update(Long id, User user);

    public void delete(Long id);

    public User findOne(Long id);

    public List<User> findAll();
}
