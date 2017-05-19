/**  
 * @Title:  Validator.java
 * @Package com.dowin.utils.common
 * @Description: TODO(用一句话描述该文件做什么)
 * @author administrator
 * @date  2016年6月6日 下午2:57:53
 * @version V1.0  
 * Update Logs:
 * ****************************************************
 * Name:
 * Date:
 * Description:
 ******************************************************
 */
package com.wang.common.util;

import java.util.regex.Pattern;

/**
 * @ClassName: ValidUtils
 * @Description: 正则表达式验证工具类
 * @author administrator
 * @date 2016年6月6日 下午2:57:53
 *
 */
public class ValidUtils
{
    /**
     * 正则表达式：验证用户名
     */
    public static final String REGEX_USERNAME = "^[a-zA-Z]\\w{5,17}$";

    /**
     * 正则表达式：验证密码
     */
    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,16}$";

    /**
     * 正则表达式：验证手机号
     */
    public static final String REGEX_MOBILE = "^((13[0-9])|(15[^4,\\D])|(18[0,2-9])|(17[0,6-8]))\\d{8}$";

    /**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 正则表达式：验证汉字
     */
    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";
    
    /**
     * 正则表达式：验证姓名(2-4位)
     */
    public static final String REGEX_REALNAME ="[\u4e00-\u9fa5]{2,4}";

    /**
     * 正则表达式：验证身份证
     */
    public static final String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";

    /**
     * 正则表达式：验证URL
     */
    public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";

    /**
     * 正则表达式：验证IP地址
     */
    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
    
    
    public static boolean isChineseName(String name) {
        if (!name.matches(REGEX_REALNAME)) {
            return false;
        }else return true;
    }

    /**
     * 校验用户名
     * 
     * @param username
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUsername(String username)
    {
        return Pattern.matches(REGEX_USERNAME, username);
    }

    /**
     * 校验密码
     * 
     * @param password
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isPassword(String password)
    {
        return Pattern.matches(REGEX_PASSWORD, password);
    }

    /**
     * 校验手机号
     * 
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile)
    {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }

    /**
     * 校验邮箱
     * 
     * @param email
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email)
    {
        return Pattern.matches(REGEX_EMAIL, email);
    }

    /**
     * 校验汉字
     * 
     * @param chinese
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isChinese(String chinese)
    {
        return Pattern.matches(REGEX_CHINESE, chinese);
    }

    /**
     * 校验身份证
     * 
     * @param idCard
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isIDCard(String idCard)
    {
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }

    /**
     * 校验URL
     * 
     * @param url
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUrl(String url)
    {
        return Pattern.matches(REGEX_URL, url);
    }

    /**
     * 校验IP地址
     * 
     * @param ipAddr
     * @return
     */
    public static boolean isIPAddr(String ipAddr)
    {
        return Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }

    public static void main(String[] args)
    {
        // String username = "fdsdfsdj";
        // System.out.println(Validator.isUsername(username));
        // System.out.println(Validator.isChinese(username));

        System.out.println(ValidUtils.isChineseName("ws"));

    }
}