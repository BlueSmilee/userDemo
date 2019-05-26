package com.example.demo.model.PO.base;

import lombok.Data;

import java.util.Date;

@Data //标签，动态生生成getset方法，如果类里面也写了get等方法，会被自定义方法覆盖
public class BaseEntity {
    private  int id;
    private Date createTime;
    private  int createUserId;
    private  Date updateTime;
    private  int updateUserId;
    private int deleteFlag;
}
