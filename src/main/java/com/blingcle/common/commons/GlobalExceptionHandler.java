package com.blingcle.common.commons;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
/*
*
 * Created by 王显锋 on 18/6/14.
 * 统一异常处理类
 */

@ControllerAdvice
@SuppressWarnings("all")
public class GlobalExceptionHandler {

    private transient static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    @ResponseBody
    public Map<String, Object> defaultErrorHandler(HttpServletRequest request, Exception e) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        e.printStackTrace();
        String error = "系统异常";
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException) e;
            error = businessException.getMessage();
        }
        if (e instanceof DuplicateKeyException) {
            DuplicateKeyException violationException = (DuplicateKeyException) e;
            String errorMessage = violationException.getMessage();
            if (errorMessage.contains("constraint")) {
                error = "违反唯一性约束";
            }
        }
        logger.error(error);
        resultMap.put("status", Constants.RETURN_STATUS_CODE_ERROR);
        resultMap.put("msg", e.getMessage());
        return resultMap;

    }
}
