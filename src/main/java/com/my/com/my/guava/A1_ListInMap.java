package com.my.com.my.guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 16:45
 * @Description
 */
public class A1_ListInMap {
    public static void main(String[] args) {
        //以前
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        map.put("名称", list);
        System.out.println(map.get("名称"));

        //现在
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("名称", "张三");
        multimap.put("名称", "李四");
        System.out.println(multimap.get("名称"));
    }

}
