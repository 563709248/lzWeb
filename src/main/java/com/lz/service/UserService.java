package com.lz.service;

import com.lz.entity.User;

import java.util.List;

/**
 * Created by Maven on 2016/2/17.
 */
public interface UserService {
    User load(String id);

    User get(String id);

    List<User> findAll();

    void persist(User entity);

    String save(User entity);

    void saveOrUpdate(User entity);

    void delete(String id);

    void flush();
}
