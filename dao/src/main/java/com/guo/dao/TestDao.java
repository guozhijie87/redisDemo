package com.guo.dao;

import com.guo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;

/**
 * Created by jack on 2017/7/11.
 */
public class TestDao {
    @Autowired
    protected RedisTemplate<Serializable, Serializable> redisTemplate;

    public  void saveUser(final User user) {
        redisTemplate.execute(new RedisCallback<Object>() {

            @Override
            public Object doInRedis(RedisConnection connection) throws DataAccessException {
                connection.set(redisTemplate.getStringSerializer().serialize("user.uid." + user.getUserid()),
                        redisTemplate.getStringSerializer().serialize(user.getBackgroundPhoto()));
                return null;
            }
        });
    }


    public User getUser(final long id) {
        return redisTemplate.execute(new RedisCallback<User>() {
            @Override
            public User doInRedis(RedisConnection connection) throws DataAccessException {
                byte[] key = redisTemplate.getStringSerializer().serialize("user.uid." + id);
                if (connection.exists(key)) {
                    byte[] value = connection.get(key);
                    String name = redisTemplate.getStringSerializer().deserialize(value);
                    User user = new User();
                    user.setPassword("222");
                    return user;
                }
                return null;
            }
        });
    }
    public static void main(String[] args) {
        ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/applicationContext-redis.xml");
        TestDao userDAO = (TestDao)ac.getBean("TestDao");
        User user1 = new User();
        user1.setUserid("aaa");
        userDAO.saveUser(user1);
        User user2 = userDAO.getUser(1);
        System.out.println("222");
    }

}
