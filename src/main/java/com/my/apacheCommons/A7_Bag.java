package com.my.apacheCommons;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 16:38
 * @Description
 */
public class A7_Bag {
    public static void main(String[] args) {
        Bag bag = new HashBag<String>();
        bag.add("a");
        bag.add("b");
        bag.add("a");
        bag.add("c", 3);
        System.out.println(bag);
        System.out.println(bag.getCount("c"));
    }
}
