package com.company.project.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName :License
 * @Description :原文对象
 * @Author :16388
 * @Date :2020/3/23 9:26
 * @Version :1.0
 **/
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class License {
    private Integer id;
    private String path;
    private String fileName;
    private String attachId;
    private String entityClassId;
    private String entityId;
    private  String refer;
    private String fileSize;

}
