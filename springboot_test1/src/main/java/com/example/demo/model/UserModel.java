package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName UserModel
 * @Description
 * @Athour Lilan
 * @Date 2020/6/17 14:42
 **/
@ApiModel(value="user对象",description="用户对象user")
public class UserModel  {
    @ApiModelProperty(name="id",value="用户id",example = "1")
    private Integer id;
    @ApiModelProperty(name="name",value="名",example = "张三")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
