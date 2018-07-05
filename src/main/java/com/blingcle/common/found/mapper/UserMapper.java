package com.blingcle.common.found.mapper;

import com.blingcle.common.found.vo.UserVo;
import com.blingcle.common.found.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserVo record);

    int insertSelective(User record);

    UserVo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(UserVo record);

    UserVo findbyphone(String phone);

    UserVo findbyloginname(UserVo userVo);

    List<UserVo> findAttention(Long id);

    List<UserVo> findFans(Long id);

    UserVo queryBuserDatail(Long id);

}