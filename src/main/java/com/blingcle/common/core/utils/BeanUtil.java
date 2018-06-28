package com.blingcle.common.core.utils;

import com.blingcle.common.core.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by 王显锋 on 18/6/14.
 */
public class BeanUtil {

    private static final Logger logger = LoggerFactory.getLogger(BeanUtil.class);

    public static Map<String, Object>[] transBean2Map(Object... objs) throws BusinessException {
        if (objs == null || objs.length == 0) {
            return null;
        }
        List objList = new ArrayList();
        for (Object obj : objs) {
            if (obj != null) {
                objList.add(obj);
            }
        }
        if (objList.size() == 0) {
            return null;
        }
        objs = (Object[]) objList.toArray(new Object[0]);
        Map[] maps = new HashMap[objs.length];
        String errKey = "";
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(objs[0].getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < objs.length; i++) {
                Object obj = objs[i];
                Map<String, Object> map = new HashMap<String, Object>();
                for (PropertyDescriptor property : propertyDescriptors) {
                    String key = property.getName();
                    errKey = key;
                    // 过滤class属性
                    if (!key.equals("class")) {
                        // 得到property对应的getter方法
                        Method getter = property.getReadMethod();
                        if (getter == null) {
                            continue;
                        }
                        Object value = getter.invoke(obj);

                        if (value != null && !isPrimitive(value)) {
                            if (value instanceof Collection) {
                                Object[] inObjs = ((Collection) value).toArray(new Object[0]);
                                value = transBean2Map(inObjs);
                            } else if (value.getClass().isArray()) {
                                if (!(value instanceof String[])) {
                                    value = transBean2Map((Object[]) value);
                                }
                            } else {
                                value = transBean2Map(value);
                            }
                        }
                        map.put(key, value);
                    }

                }
                maps[i] = map;
            }
        } catch (Exception e) {
            logger.error("Bean转Map失败：" + e.getMessage() + "errKey:" + errKey);
            e.printStackTrace();
            throw new BusinessException(e.getMessage());
        }
        return maps;
    }

    public static boolean isPrimitive(Object obj) {
        if (obj == null) {
            return false;
        }
        Class<?> objClass = obj.getClass();
        boolean isPrimitive = objClass.isPrimitive();
        if (!isPrimitive) {
            isPrimitive = obj instanceof String || obj instanceof Integer || obj instanceof Long
                    || obj instanceof Short || obj instanceof Boolean || obj instanceof Byte
                    || obj instanceof Double || obj instanceof Float || obj instanceof Character
                    || obj instanceof Date || obj instanceof java.sql.Date;
        }
        return isPrimitive;
    }

    public static Map transBean2Map(Object obj) throws BusinessException {
        Map<String, Object> map = new HashMap<String, Object>();
        if (obj == null) {
            return null;
        }
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    if (getter == null) {
                        continue;
                    }
                    Object value = getter.invoke(obj);
                    if (value != null) {
                        if (!isPrimitive(value)) {
                            if (value instanceof Collection) {
                                Object[] inObjs = ((Collection) value).toArray(new Object[0]);
                                value = transBean2Map(inObjs);
                            } else if (value.getClass().isArray()) {
                                if (!(value instanceof String[])) {
                                    value = transBean2Map((Object[]) value);
                                }
                            } else {
                                value = transBean2Map(value);
                            }
                        }
                        map.put(key, value);
                    }
                }

            }
        } catch (Exception e) {
            logger.error("Bean转Map失败：" + e.getMessage());
            throw new BusinessException(e.getMessage());
        }
        return map;
    }

    public static List transBean2Bean(Object[] srcObjs, Class dstObj) {
        if (srcObjs == null || srcObjs.length == 0) {
            return null;
        } else {
            List list = new ArrayList();
            try {
                for (int i = 0; i < srcObjs.length; i++) {
                    Object obj = dstObj.newInstance();
                    BeanUtils.copyProperties(srcObjs[i], obj);
                    list.add(obj);
                }
            } catch (Exception e) {
                logger.error("Bean转Bean失败：" + e.getMessage());
            }
            return list;
        }
    }

    public static Map[] transValue2Map(Object[] objs, String key) {
        if (objs == null || objs.length == 0) {
            return null;
        }
        Map[] rtnMaps = new HashMap[objs.length];
        for (int i = 0; i < objs.length; i++) {
            Map map = new HashMap();
            map.put(key, objs[i]);
            rtnMaps[i] = map;
        }
        return rtnMaps;
    }

    public static Object[] transMap2Bean(Object obj, Map... maps) {
        Object[] objs = new Object[maps.length];
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < maps.length; i++) {
                for (PropertyDescriptor property : propertyDescriptors) {
                    String key = property.getName();
                    if (maps[i].containsKey(key)) {
                        Object value = maps[i].get(key);
                        // 得到property对应的setter方法  
                        System.out.println(key + "\t" + value);
                        Method setter = property.getWriteMethod();
                        setter.invoke(obj, value);
                    }
                }
                objs[i] = obj;
            }
        } catch (Exception e) {
            logger.error("Map转Bean失败：" + e.getMessage());
        }
        return objs;
    }

    public static void copyBean(Object source, Object target) {
        if (StringUtils.isEmpty(source) || StringUtils.isEmpty(target)) {
            return;
        }
        try {
            BeanUtils.copyProperties(source, target);
        } catch (Exception e) {
            logger.error("copy bean  exception" + e.getMessage());
        }

    }

    public static void copyPojo(Object source, Object target) {
        try {
            BeanInfo sourceBeanInfo = Introspector.getBeanInfo(source.getClass());
            Class<?> targetClass = target.getClass();
            PropertyDescriptor[] sourceBeanInfoPropertyDescriptors = sourceBeanInfo.getPropertyDescriptors();
            for (PropertyDescriptor sourceProperty : sourceBeanInfoPropertyDescriptors) {
                String key = sourceProperty.getName();
                // 过滤class属性
                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = sourceProperty.getReadMethod();
                    Method setter = targetClass.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), sourceProperty.getPropertyType());
                    if (getter == null) {
                        continue;
                    }
                    Object value = getter.invoke(source);
                    setter.invoke(target, value);
                }
            }
        } catch (Exception e) {
            logger.error("POJO复制失败，错误信息为：{}", e.getMessage());
            throw new BusinessException(e.getMessage());
        }
    }

//    public static void main(String[] args){
//        BfpAtsinterfaceTi source = new BfpAtsinterfaceTi();
//        BfpAtsinterfaceTi target = new BfpAtsinterfaceTi();
//        source.setAbstractno("abstractno11");
//        source.setAccountno("accountno22");
//        source.setAmount(1000L);
//        copyPojo(source, target);
//        System.out.println(target);
//    }


    public static Object transBean2Bean(Object srcObj, Class dstObj) {
        Object obj = null;
        if (srcObj == null) {
            return null;
        } else {
            try {
                obj = dstObj.newInstance();
                BeanUtils.copyProperties(srcObj, obj);
            } catch (Exception e) {
                logger.error("Bean转Bean失败：" + e.getMessage());
            }
            return obj;
        }
    }

    public static Boolean findColunm(ResultSet rs, String colunm) {
        boolean flag = true;
        try {
            rs.findColumn(colunm);
        } catch (SQLException e) {
            flag = false;
        }
        return flag;
    }
}
