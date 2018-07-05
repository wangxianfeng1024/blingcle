package com.blingcle.common.found.buser.service.impl;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.Page;
import com.blingcle.common.found.buser.service.UserService;
import com.blingcle.common.found.mapper.UserMapper;
import com.blingcle.common.found.mapper.UserdetailMapper;
import com.blingcle.common.found.mapper.VideoMapper;
import com.blingcle.common.found.pojo.Userdetail;
import com.blingcle.common.found.vo.UserVo;
import com.blingcle.common.found.vo.VideoVo;
import com.blingcle.common.utils.AESUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by 王显锋 on 2018/7/4.
 */
@Service
public class UserServiceimpl implements UserService {
    private static Logger logger = LoggerFactory.getLogger(UserServiceimpl.class);
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserdetailMapper userdetailMapper;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private VideoMapper videoMapper;

    @Override
    @Transactional
    public UserVo register(UserVo userVo) throws BusinessException {
        logger.info("用户注册ServiceImpl");
        HttpSession session = request.getSession();
        String s = "123123";// (String) session.getAttribute(busertc.getPhone());
        if (ObjectUtils.isEmpty(s)) {
            throw new BusinessException("验证码失效！");
        }
        if (!s.equals(userVo.getAuthkey())) {
            throw new BusinessException("验证码错误！");
        }
        if (!ObjectUtils.isEmpty(userMapper.findbyphone(userVo.getPhone()))) {
            throw new BusinessException("用户已存在！");
        }

        userMapper.insert( defaultval (userVo));
        Userdetail userdetail = new Userdetail();
        userdetail.setUserid(userVo.getId());
        userdetailMapper.insert(userdetail);
        userVo = userMapper.selectByPrimaryKey(userVo.getId());
        return userVo;
    }

    @Override
    @Transactional
    public UserVo login(UserVo userVo) throws BusinessException {
        logger.info("用户登录ServiceImpl");
//        Busertc busertc = null;
        if (userVo.getLogintype().equals(Constants.LOGIN_FOR_PHONE)) {
            HttpSession session = request.getSession();
            String s = "123123";// (String) session.getAttribute(busertc.getPhone());
            if (!s.equals(userVo.getAuthkey())) {
                throw new BusinessException("验证码错误！");
            }
            userVo = userMapper.findbyphone(userVo.getPhone());
            if (ObjectUtils.isEmpty(userVo)) {
                throw new BusinessException("用户不存在！");
            }
            return userVo;
        }
        userVo.setPassword(AESUtil.decrypt(userVo.getPassword(), Constants.PASSWORD_DECRYPT_KEY));
        userVo = userMapper.findbyloginname(userVo);
        if (ObjectUtils.isEmpty(userVo)) {
            throw new BusinessException("用户不存在或密码错误！");
        }
        return userVo;
    }

    @Override
    public UserVo queryUserDetail(Long id) {
        UserVo userVo = userMapper.selectByPrimaryKey(id);
        if (ObjectUtils.isEmpty(userVo)) {
            throw new BusinessException("用户不存在");
        }
        Page page = new Page();
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        PageInfo pageInfo = new PageInfo<VideoVo>(videoMapper.findByUserid(id));
        userVo.setProduction(pageInfo);//作品
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        userVo.setPraise(new PageInfo<VideoVo>(videoMapper.findByPraiseid(id)));//喜欢的视频
        userVo.setAttention(userMapper.findAttention(id));//我的关注
        userVo.setFans(userMapper.findFans(id));// 我的粉丝
        return userVo;
    }

    @Override
    @Transactional
    public UserVo updateUserDetail(UserVo userVo) throws BusinessException {
        userMapper.updateByPrimaryKey(userVo);
        userdetailMapper.updateByPrimaryKey(userVo.getUserdetail());
        userVo = userMapper.queryBuserDatail(userVo.getId());
        return userVo;
    }

    protected UserVo defaultval(UserVo userVo)throws BusinessException {
        userVo.setCreatedate(new Date());
        userVo.setStatus(0);
        userVo.setVersion(0);
        userVo.setIsvalid(true);
        userVo.setFristlogintime(new Date());
        userVo.setIsrealname(false);
        userVo.setType(0);
        userVo.setIsprime(false);
        return userVo;
    }
}
