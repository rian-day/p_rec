package com.goi.core.base;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class BaseController {
    protected static String toJSONString(Object object,String resultMsg,Integer resultCode){
        Map map = new HashMap();
        map.put("data",object);
        map.put("resultMsg", resultMsg);
        map.put("resultCode", resultCode);
        return JSON.toJSONString(map);
    }
}
