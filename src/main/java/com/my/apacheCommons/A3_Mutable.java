package com.my.apacheCommons;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.MutableTriple;

import java.util.Date;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 16:06
 * @Description
 */
public class A3_Mutable {
    public static void main(String[] args) {

        MutablePair<Integer, String> mutablePair = MutablePair.of(2, "这是两个值");
        System.out.println(mutablePair.getLeft() + "  " + mutablePair.getRight());

        MutableTriple<Integer, String, Date> mutableTriple = MutableTriple.of(2, "这是三个值", new Date());
        System.out.println(mutableTriple.getLeft() + " " + mutableTriple.getMiddle() + " " + mutableTriple.getRight());
    }

}
