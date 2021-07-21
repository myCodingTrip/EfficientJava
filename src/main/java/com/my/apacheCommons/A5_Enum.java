package com.my.apacheCommons;

import org.apache.commons.lang3.EnumUtils;

import java.util.List;
import java.util.Map;

/**
 * @author mayu
 * @version 创建时间：2021/7/21 16:13
 * @Description
 */
public class A5_Enum {
    public static void main(String[] args) {
        ImagesTypeEnum imagesTypeEnum = EnumUtils.getEnum(ImagesTypeEnum.class, "JPG");
        System.out.println("imagesTypeEnum = " + imagesTypeEnum);
        System.out.println("--------------");
        List<ImagesTypeEnum> imagesTypeEnumList = EnumUtils.getEnumList(ImagesTypeEnum.class);
        imagesTypeEnumList.stream().forEach(
                imagesTypeEnum1 -> System.out.println("imagesTypeEnum1 = " + imagesTypeEnum1)
        );
        System.out.println("--------------");
        Map<String, ImagesTypeEnum> imagesTypeEnumMap = EnumUtils.getEnumMap(ImagesTypeEnum.class);
        imagesTypeEnumMap.forEach((k, v) -> System.out.println("key：" + k + ",value：" + v));
        System.out.println("-------------");
        boolean result = EnumUtils.isValidEnum(ImagesTypeEnum.class, "JPG");
        System.out.println("result = " + result);
        boolean result1 = EnumUtils.isValidEnum(ImagesTypeEnum.class, null);
        System.out.println("result1 = " + result1);
    }

}
