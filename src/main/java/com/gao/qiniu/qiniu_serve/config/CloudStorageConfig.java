package com.gao.qiniu.qiniu_serve.config;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @className: CloudStorageConfig
 * @description: 云存储配置类
 * @author: gsong
 * @date: 2021/4/15
 **/
@Data
@Configuration
public class CloudStorageConfig {


    /**
     * 七牛域名domain
     */
    @Value("${oss.qiniu.domain}")
    private String qiniuDomain;
    /**
     * 七牛ACCESS_KEY
     */
    @Value("${oss.qiniu.accessKey}")
    private String qiniuAccessKey;
    /**
     * 七牛SECRET_KEY
     */
    @Value("${oss.qiniu.secretKey}")
    private String qiniuSecretKey;
    /**
     * 七牛空间名
     */
    @Value("${oss.qiniu.bucketName}")
    private String qiniuBucketName;


}
