package com.my.com.my.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

public class A6_LoadingCache {

    public static void main(String[] args) throws Exception {
        System.out.println(numCache.get(1));
        Thread.sleep(1000);
        System.out.println(numCache.get(1));
        Thread.sleep(1000);
        numCache.put(1, 6);
        System.out.println(numCache.get(1));
    }

    private static LoadingCache<Integer, Integer> numCache = CacheBuilder.newBuilder().
            expireAfterWrite(5L, TimeUnit.MINUTES).
            maximumSize(5000L).
            build(new CacheLoader<Integer, Integer>() {
                @Override
                public Integer load(Integer key) {
                    System.out.println("no cache");
                    return key * 5;
                }
            });
}
