package com.company.project.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @ClassName :material
 * @Description :TODO
 * @Author :16388
 * @Date :2020/3/23 9:34
 * @Version :1.0
 **/
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Material {
    private Integer id;
    private String name;
    private Integer count=0;
    private String classNumber;
    private List<License> content;
    private String isScan;
    private String refer;
    private String flag;
    private Integer shareCount;
}
