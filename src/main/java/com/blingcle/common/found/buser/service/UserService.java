package com.blingcle.common.found.buser.service;

import com.blingcle.common.found.buser.vo.UserVo;
import com.blingcle.common.found.pojo.User;

/**
 * Created by 王显锋 on 2018/7/4.
 */
public interface UserService {

    UserVo register(UserVo userVo);

    UserVo login(UserVo userVo);

    UserVo queryUserDetail(Long id);


}
