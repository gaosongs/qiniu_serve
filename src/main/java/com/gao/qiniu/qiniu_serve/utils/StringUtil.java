package com.gao.qiniu.qiniu_serve.utils;

import cn.hutool.core.date.DateUtil;

import java.util.UUID;

/**
 * @className: StringUtil
 * @description: 在`StringUtil`中创建方法`getRandomImgName(String fileName)`
 * 根据上传文件名称，使用UUID`生成唯一的图片名称`，防止命名冲突
 * @author: gsong
 * @date: 2021/4/15
 **/
public class StringUtil {
    /**
     * @Description: 生成唯一图片名称
     * @Param: fileName
     * @return: 云服务器fileName
     */
    public static String getRandomImgName(String fileName) {

        int index = fileName.lastIndexOf(".");

        if ((fileName == null || fileName.isEmpty()) || index == -1){
            throw new IllegalArgumentException();
        }
        // 获取文件后缀
        String suffix = fileName.substring(index);
        // 生成UUID
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        // 生成上传至云服务器的路径
        String path = "code/duck/" + DateUtil.today() + "-" + uuid + suffix;
        return path;
    }
}
