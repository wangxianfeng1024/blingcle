package com.blingcle.common.found.buser.controller;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.constant.GlobleConstant;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.found.buser.service.UserService;
import com.blingcle.common.found.buser.vo.UserVo;
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
import java.util.HashMap;
import java.util.Map;

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
     *
     * @param busertc
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/getauthkey")
    public Map<String, Object> getauthkey(@RequestBody BaseList<UserVo> baseList) throws BusinessException {
        logger.info("发送验证码Controller");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        UserVo userVo = baseList.getFormbean();
        String s = "123123";// SendAuthkey.getFourRandom();
        String result = "0"; //SendAuthkey.sendTplSms(pusertc.getPhone(), "@1@=" + s);
        if (!result.equals(Constants.MESSAGE_SEND_SUCCESS)) {
            resultMap.put("status", Constants.RETURN_STATUS_CODE_ERROR);
            return resultMap;
        }
        HttpSession session = request.getSession();
        session.setAttribute(userVo.getPhone(), s);
        session.setMaxInactiveInterval(120);
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        return resultMap;
    }

    /**
     * 用户注册
     *
     * @param busertc
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/register")
    public Map<String, Object> register(@RequestBody BaseList<UserVo> baseList) throws BusinessException {
        logger.info("用户注册Controller");
        UserVo userVo = baseList.getFormbean();
        Map<String, Object> resultMap = new HashMap<String, Object>();
        HttpSession session = request.getSession();
         userVo= userService.register(userVo);
        session.setAttribute(GlobleConstant.B_SESSION_CODE, userVo);
        session.setMaxInactiveInterval(serverProperties.getSession().getTimeout());
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        resultMap.put("data", userVo);
        return resultMap;
    }

    /**
     * 用户登录
     *
     * @param busertcVo
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/login")
    public Map<String, Object> login(@RequestBody BaseList<UserVo> baseList) throws BusinessException {
        logger.info("用户登录Controller");
        UserVo userVo = baseList.getFormbean();
        Map<String, Object> resultMap = new HashMap<String, Object>();
        HttpSession session = request.getSession();
        userVo = userService.login(userVo);
        session.setAttribute(GlobleConstant.B_SESSION_CODE, userVo);
        session.setMaxInactiveInterval(serverProperties.getSession().getTimeout());
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        resultMap.put("data", userVo);
        return resultMap;
    }

    /**
     * 查询用户详细信息
     * @param baseList
     * @return
     */
    @PostMapping(value = "/queryUserDetail")
    public Map<String,Object> queryUserDetail(@RequestBody  BaseList<UserVo> baseList){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        UserVo userVo =  baseList.getFormbean();
        userVo= userService.queryUserDetail(baseList.getId());
        resultMap.put("status",Constants.RETURN_STATUS_CODE_SUCCESS);
        resultMap.put("data",userVo);
        return resultMap;
    }

    /**
     * 修改用户信息
     * @param busertc
     * @return
     */
//    @PostMapping(value = "/updataBusertcDetail")
//    public Map<String,Object> updataBusertcDetail(@RequestBody   BaseList<Busertc> baseList){
//        Map<String, Object> resultMap = new HashMap<String, Object>();
//        Busertc busertc =  baseList.getFormbean();
//        busertcservice.updataBusertcDatail(busertc);
//        resultMap.put("status",Constants.RETURN_STATUS_CODE_SUCCESS);
//        resultMap.put("data",busertc);
//        return resultMap;
//    }
}
