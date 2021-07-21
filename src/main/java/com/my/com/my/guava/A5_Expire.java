package com.my.com.my.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 16:54
 * @Description
 */
public class A5_Expire {
    public static void main(String[] args) throws InterruptedException {
        //设置过期时间为2秒
        Cache<String, String> cache1 = CacheBuilder.newBuilder().maximumSize(2)
                .expireAfterAccess(2, TimeUnit.SECONDS).build();
        cache1.put("key1", "value1");
        Thread.sleep(1000);
        System.out.println(cache1.getIfPresent("key1"));
        Thread.sleep(2000);
        System.out.println(cache1.getIfPresent("key1"));
    }

}
