package com.my.apacheCommons;

import org.apache.commons.lang3.StringUtils;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 15:59
 * @Description
 */
public class A1_String {
    public static void main(String[] args) {
        boolean blank = StringUtils.isBlank(" ");//注意此处是null哦  这和isEmpty不一样的
        System.out.println(blank);

        boolean empty = StringUtils.isEmpty(" ");//注意这里是false
        System.out.println(empty);

        boolean anyBlank = StringUtils.isAnyBlank("a", " ", "c");// 其中一个是空字符串
        System.out.println(anyBlank);

        boolean numeric = StringUtils.isNumeric("1");//字符串是不是全是数字组成，"." 不算数字
        System.out.println(numeric);

        String remove = StringUtils.remove("abcdefgh", "a");//移除字符串
        System.out.println(remove);
    }
}
