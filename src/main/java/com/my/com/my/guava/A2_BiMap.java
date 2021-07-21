package com.my.com.my.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 16:48
 * @Description
 */
public class A2_BiMap {
    public static void main(String[] args) {
        //会报异常
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("key1", "value");
        biMap.put("key2", "value");
        System.out.println(biMap.get("key1"));
    }
}
