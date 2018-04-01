package com.mes.baseserver.utils;

import org.apache.commons.lang.StringUtils;

/**
 * @ClassName:
 * @Description: java类作用描述
 * @Author: LiuYunfei
 * @CreateDate: 2018/4/2 0:24
 */
public class FotmatUtil {
    public static String ArrayToString(String[] strs){
        String str1= StringUtils.join(strs, "','");
        String str2 = String.format("'%s'", str1);
        return str2;
    }
}
