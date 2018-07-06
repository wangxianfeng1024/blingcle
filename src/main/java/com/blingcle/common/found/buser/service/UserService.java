package com.blingcle.common.found.buser.service;

import com.blingcle.common.found.vo.UserVo;

/**
 * Created by 王显锋 on 2018/7/4.
 */
public interface UserService {

    UserVo register(UserVo userVo);

    UserVo login(UserVo userVo);

    UserVo queryUserDetail(Long id);

    UserVo updateUserDetail(UserVo userVo);

    int changePassword(UserVo userVo);

}
