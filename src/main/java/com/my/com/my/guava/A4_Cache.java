package com.my.com.my.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 16:52
 * @Description
 */
public class A4_Cache {
    public static void main(String[] args) {
        Cache<String, String> cache = CacheBuilder.newBuilder().maximumSize(2).build();
        cache.put("key1", "value1");
        cache.put("key2", "value2");
        cache.put("key3", "value3");
        System.out.println(cache.getIfPresent("key1")); //key1 = null
    }
}
