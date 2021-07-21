package com.my.apacheCommons;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 16:09
 * @Description
 */
public class A4_Array {
    public static void main(String[] args) {

        //合并数组
        String[] array1 = new String[]{"value1", "value2"};
        String[] array2 = new String[]{"value3", "value4"};
        String[] array3 = ArrayUtils.addAll(array1, array2);
        System.out.println("array3:" + ArrayUtils.toString(array3));

        //clone 数组
        String[] array4 = ArrayUtils.clone(array3);
        System.out.println("array4:" + ArrayUtils.toString(array4));

        //数组是否相同
        boolean b = EqualsBuilder.reflectionEquals(array3, array4);
        System.out.println(b);

        //反转数组
        ArrayUtils.reverse(array4);
        System.out.println("array4反转后：" + ArrayUtils.toString(array4));

        //二维数组转 map
        Map<String, String> arrayMap = (HashMap) ArrayUtils.toMap(new String[][]{
                {"key1", "value1"}, {"key2", "value2"}
        });
        for (String s : arrayMap.keySet()) {
            System.out.println(arrayMap.get(s));
        }
    }

}
