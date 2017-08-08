package com.guo.service;


import com.guo.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by lmm on 16-8-10.
 */
public interface UserService {
    void signOn(User user);

    User signIn(String userName, String password) ;

    void upgrade(User user);

//    void update(User user);

    User get(String userId);

    List<User> all();

    List<User> all(int index, int size);

    void updateByPrimaryKeySelective(User user);

    Map<String,Object> getUsers(int index, int size, String userId);

    List<User> getUsersByUserId(int index, int size, String userId);

    void saveUser( User user);

    User getUser(final String id);

    List<User> getUserList();

    void saveUserList();
}
