package com.my.com.my.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 16:48
 * @Description
 */
public class A3_BiMap {
    public static void main(String[] args) {
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("key1", "value1");
        biMap.put("key2", "value2");
        System.out.println(biMap.get("key1"));

        //key-value 对调
        biMap = biMap.inverse();
        System.out.println(biMap.get("value1"));
    }
}
