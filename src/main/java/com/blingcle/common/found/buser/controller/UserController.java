package com.blingcle.common.found.buser.controller;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.constant.GlobleConstant;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.core.utils.JsonUtil;
import com.blingcle.common.found.buser.service.UserService;
import com.blingcle.common.found.vo.UserVo;
import com.blingcle.common.utils.SendUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 王显锋 on 2018/7/4.
 */
@RestController
@RequestMapping("/UserController")
@SuppressWarnings("all")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private ServerProperties serverProperties;
    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;

    /**
     * 发送验证码
     * @param busertc
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/getauthkey")
    public Object getauthkey(@RequestBody BaseList<UserVo> baseList) throws BusinessException {
        logger.info("发送验证码Controller");
        UserVo userVo = baseList.getFormbean();
        String s = SendUtils.getFourRandom();
        String result = SendUtils.sendMessage(userVo.getPhone(),s);
        if (!result.equals(Constants.MESSAGE_SEND_SUCCESS)) {
            return JsonUtil.failure("验证码发送失败！");
        }
        HttpSession session = request.getSession();
        session.setAttribute(userVo.getPhone(), s);
        session.setMaxInactiveInterval(120);
        return JsonUtil.success();
    }

    /**
     * 用户注册
     * @param baseList
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/register")
    public  Object register(@RequestBody BaseList<UserVo> baseList) throws BusinessException {
        logger.info("用户注册Controller");
        UserVo userVo = baseList.getFormbean();
        HttpSession session = request.getSession();
        userVo = userService.register(userVo);
        session.setAttribute(GlobleConstant.B_SESSION_CODE, userVo);
        session.setMaxInactiveInterval(serverProperties.getSession().getTimeout());
        return JsonUtil.success(userVo);
    }

    /**
     * 用户登录
     * @param baseList
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/login")
    public Object login(@RequestBody BaseList<UserVo> baseList) throws BusinessException {
        logger.info("用户登录Controller");
        UserVo userVo = baseList.getFormbean();
        HttpSession session = request.getSession();
        userVo = userService.login(userVo);
        session.setAttribute(GlobleConstant.B_SESSION_CODE, userVo);
        session.setMaxInactiveInterval(serverProperties.getSession().getTimeout());
        return JsonUtil.success(userVo);
    }

    /**
     * 查询用户详细信息
     * @param baseList
     * @return
     */
    @PostMapping(value = "/queryUserDetail")
    public Object queryUserDetail(@RequestBody BaseList<UserVo> baseList) {
        UserVo userVo = baseList.getFormbean();
        userVo = userService.queryUserDetail(baseList.getId());
        return JsonUtil.success(userVo);
    }

    /**
     * 修改用户信息
     * @param baseList
     * @return
     */
    @PostMapping(value = "/updateUserDetail")
    public Object updateUserDetail(@RequestBody BaseList<UserVo> baseList) {
        UserVo userVo = baseList.getFormbean();
        userVo = userService.updateUserDetail(userVo);
        return JsonUtil.success(userVo);
    }

    /**
     *修改密码
     * @param baseList
     * @return
     */
    @PostMapping(value = "/changePassword")
    public Object changePassword(@RequestBody BaseList<UserVo> baseList) {
        UserVo userVo = baseList.getFormbean();
        userService.changePassword(userVo);
        return JsonUtil.success();
    }

}
