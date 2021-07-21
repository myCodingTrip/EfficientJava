package com.my.apacheCommons;

import org.apache.commons.beanutils.BeanUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 16:41
 * @Description
 */
public class A8_BeanToMap {
    public static void main(String[] args) throws Exception {
        User user1 = new User();
        user1.setName("李四");
        User user2 = (User) BeanUtils.cloneBean(user1);
        System.out.println(user2.getName());

        //User 转 map
        Map<String, String> describe = BeanUtils.describe(user1);
        System.out.println(describe);

        //Map 转 User
        Map<String, String> beanMap = new HashMap();
        beanMap.put("name", "张三");
        User user3 = new User();
        BeanUtils.populate(user3, beanMap);
        System.out.println(user3.getName());
    }
}
