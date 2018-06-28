package com.blingcle.common.found.service.impl;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.Page;
import com.blingcle.common.found.mapper.BuserdetailtcMapper;
import com.blingcle.common.found.mapper.BuserfriendtdMapper;
import com.blingcle.common.found.mapper.BusertcMapper;
import com.blingcle.common.found.mapper.BvideotdMapper;
import com.blingcle.common.found.pojo.Buserdetailtc;
import com.blingcle.common.found.pojo.Busertc;
import com.blingcle.common.found.pojo.Bvideotd;
import com.blingcle.common.found.service.Busertcservice;
import com.blingcle.common.found.vo.BusertcVo;
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
import java.util.List;

/**
 * Created by 王显锋 on 2018/6/26.
 */
@Service
@SuppressWarnings("all")
public class BusertcserviceImpl implements Busertcservice {
    private static Logger logger = LoggerFactory.getLogger(BusertcserviceImpl.class);
    @Autowired
    private BusertcMapper busertcMapper;
    @Autowired
    private BuserdetailtcMapper buserdetailtcMapper;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private BvideotdMapper bvideotdMapper;
    @Autowired
    private BuserfriendtdMapper buserfriendtdMapper;

    @Override
    @Transactional
    public Busertc register(BusertcVo busertcVo) throws BusinessException {
        logger.info("用户注册ServiceImpl");
        HttpSession session = request.getSession();
        String s = "123123";// (String) session.getAttribute(busertc.getPhone());
        if (ObjectUtils.isEmpty(s)) {
            throw new BusinessException("验证码失效！");
        }
        if (!s.equals(busertcVo.getAuthkey())) {
            throw new BusinessException("验证码错误！");
        }
        if (!ObjectUtils.isEmpty(busertcMapper.findbyphone(busertcVo))) {
            throw new BusinessException("用户已存在！");
        }
        busertcMapper.insert(busertcVo);
        Buserdetailtc buserdetailtc = new Buserdetailtc();
        buserdetailtc.setUserid(busertcVo.getId());
        buserdetailtcMapper.insert(buserdetailtc);
        Busertc busertc = busertcMapper.selectByPrimaryKey(busertcVo.getId());
        return busertc;
    }

    @Override
    @Transactional
    public Busertc login(BusertcVo busertcVo) throws BusinessException {
        logger.info("用户登录ServiceImpl");
        Busertc busertc = null;
        if (busertcVo.getLogintype().equals(Constants.LOGIN_FOR_PHONE)) {
            HttpSession session = request.getSession();
            String s = "123123";// (String) session.getAttribute(busertc.getPhone());
            if (!s.equals(busertcVo.getAuthkey())) {
                throw new BusinessException("验证码错误！");
            }
            busertc = busertcMapper.findbyphone(busertcVo);
            if (ObjectUtils.isEmpty(busertc)) {
                throw new BusinessException("用户不存在！");
            }
            return busertc;
        }
        busertcVo.setPassword(AESUtil.decrypt(busertc.getPassword(), Constants.PASSWORD_DECRYPT_KEY));
        busertc = busertcMapper.findbyloginname(busertcVo);
        if (ObjectUtils.isEmpty(busertc)) {
            throw new BusinessException("用户不存在或密码错误！");
        }
        return busertc;
    }


    @Override
    public Busertc queryBusertcDatail(Long id) {
        Busertc busertc = busertcMapper.queryBusertcDatail(id);
        if (ObjectUtils.isEmpty(busertc)) {
            throw new BusinessException("用户不存在");
        }
        Page page = new Page();
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        PageInfo pageInfo = new PageInfo<Bvideotd>(bvideotdMapper.findByUserid(id));
        busertc.setProduction(pageInfo);//作品
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        busertc.setPraise(new PageInfo<Bvideotd>(bvideotdMapper.findByPraiseid(id)));//喜欢的视频
        busertc.setAttention(busertcMapper.findAttention(id));//我的关注
        busertc.setFans(busertcMapper.findFans(id));// 我的粉丝
        return busertc;
    }

    @Override
    @Transactional
    public Busertc updataBusertcDatail(Busertc busertc) throws BusinessException {
        busertcMapper.updateByPrimaryKey(busertc);
        buserdetailtcMapper.updateByPrimaryKey(busertc.getBuserdetailtc());
        busertc = busertcMapper.queryBusertcDatail(busertc.getId());
        return busertc;
    }
}
