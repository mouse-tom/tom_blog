package com.mouse.blog.utils;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 杨雪松
 * @Description json 工具类
 * @create 2018-02-02 18:45
 **/
public class JSONUtil {

     /*
      * @Description 对象转换 json 串
      * @author 杨雪松
      * @date 2018/2/2 18:50
      */
    public static String objectToString(String msg , Object object){
        Map<String,Object> dataMap = new HashMap<String,Object>();
        dataMap.put("msg",msg);
        dataMap.put("data",object);
        return JSON.toJSONString(dataMap);
    }
}
