package com.guo.service.impl;


import com.guo.dao.UserMapper;
import com.guo.model.User;
import com.guo.model.UserExamplePage;
import com.guo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.*;

/**
 * Created by lmm on 16-9-21.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void signOn(User user) {
        userMapper.insert(user);
    }

    @Override
    public User signIn(String userName, String password) {
        User user = userMapper.selectByPrimaryKey(userName);

            return user;

    }

    @Override
    public void upgrade(User user) {
        if (user != null) {
            user.setLastupgradetime(new Date());

            userMapper.updateByPrimaryKey(user);
        }
    }

    @Override
    public User get(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> all() {
        return userMapper.selectByExample(null);
    }


    @Override
    public Map<String, Object> getUsers(int index, int size, String userId) {
        Map<String, Object> result = new HashMap<String, Object>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("userId", userId);
        data.put("index", index);
        data.put("size", size);
        int count = userMapper.countList(data);
        result.put("count", count);
        List<User> userList = userMapper.queryList(data);
        result.put("list", userList);
        return result;
    }

    @Override
    public void updateByPrimaryKeySelective(User user) {
        if (user != null) {
            user.setLastupgradetime(new Date());

            userMapper.updateByPrimaryKeySelective(user);
        }
    }

    @Override
    public List<User> getUsersByUserId(int index, int size, String userId) {
        UserExamplePage e = new UserExamplePage();
        e.setIndex(index);
        e.setSize(size);
        e.setOrderByClause("createtime desc");
        UserExamplePage.Criteria c = e.or();
        if (userId != null && !"".equals(userId)) {
            c.andUseridLike("%" + (String) userId + "%");
        }
        List<User> users = userMapper.selectByExamplePage(e);
        return users;
    }

    @Override
    public List<User> all(int index, int size) {
        UserExamplePage e = new UserExamplePage();
        e.setIndex(index);
        e.setSize(size);
        e.setOrderByClause("createtime desc");
        List<User> users = userMapper.selectByExamplePage(e);
        return users;
    }


   @Resource(name="redisTemplate")
     RedisTemplate redisTemplate;

    @Override
    public void saveUser( User user) {
      // redisTemplate.opsForValue().set("guo", "ok");
//        redisTemplate.execute(new RedisCallback<Object>() {
//
//            @Override
//            public Object doInRedis(RedisConnection connection) throws DataAccessException {
//                connection.set(redisTemplate.getStringSerializer().serialize("user.uid." + user.getUserid()),
//                        redisTemplate.getStringSerializer().serialize(user.getProfilephoto()));
//                return null;
//            }
//        });
//        ValueOperations<String, User> valueops = redisTemplate.opsForValue();
        ValueOperations<String, User> valueops = redisTemplate.opsForValue();
        valueops.set(user.getUserid(), user);

    }

    @Override
    public User getUser(final String id) {
        ValueOperations<String, User> valueops = redisTemplate
                     .opsForValue();
              User user = valueops.get(id);
              return user;
    }

    public JedisConnectionFactory connectionFactory(){
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setUsePool(true);
        jedisConnectionFactory.setHostName("192.168.1.108");
        jedisConnectionFactory.setPort(Integer.parseInt("6379"));
        jedisConnectionFactory.afterPropertiesSet();
        return jedisConnectionFactory;
    }

    @Override
    public void saveUserList() {
        // redisTemplate.opsForValue().set("guo", "ok");
//        redisTemplate.execute(new RedisCallback<Object>() {
//
//            @Override
//            public Object doInRedis(RedisConnection connection) throws DataAccessException {
//                connection.set(redisTemplate.getStringSerializer().serialize("user.uid." + user.getUserid()),
//                        redisTemplate.getStringSerializer().serialize(user.getProfilephoto()));
//                return null;
//            }
//        });
//        ValueOperations<String, User> valueops = redisTemplate.opsForValue();
        List<User> list=new ArrayList<User>();
        for(int i=0;i<=5;i++){
            User user=new User();
            user.setUserid(""+i);
            list.add(user);
        }
        ListOperations<String, List> valueops = redisTemplate.opsForList();
        valueops.leftPush("list",list);

    }

    @Override
    public List<User> getUserList() {
        // redisTemplate.opsForValue().set("guo", "ok");
//        redisTemplate.execute(new RedisCallback<Object>() {
//
//            @Override
//            public Object doInRedis(RedisConnection connection) throws DataAccessException {
//                connection.set(redisTemplate.getStringSerializer().serialize("user.uid." + user.getUserid()),
//                        redisTemplate.getStringSerializer().serialize(user.getProfilephoto()));
//                return null;
//            }
//        });
//        ValueOperations<String, User> valueops = redisTemplate.opsForValue();


        ListOperations<String, List> valueops = redisTemplate.opsForList();
         List<User> list= valueops.leftPop("list");
         return list;

    }


}
