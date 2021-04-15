package com.gao.qiniu.qiniu_serve.service;

import com.gao.qiniu.qiniu_serve.config.CloudStorageConfig;

import java.io.FileInputStream;
/**
 * @className: UploadImageService
 * @description: 上传业务抽象类
 * @author: gsong
 * @date: 2021/4/15
 **/
public abstract class UploadImageService {

    protected CloudStorageConfig config;

    public abstract String uploadQNImg(FileInputStream file, String path);
}