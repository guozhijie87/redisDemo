package com.guo.dao;

import com.guo.model.User;
import com.guo.model.UserExample;
import com.guo.model.UserExamplePage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(User record);

    /**
     * 查询结果总条数
     */
    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByExamplePage(UserExamplePage userExamplePage);

    int selectCountByExamplePage(UserExamplePage userExamplePage);


    int countList(Map<String, Object> data);

    List<User> queryList(Map<String, Object> data);
}