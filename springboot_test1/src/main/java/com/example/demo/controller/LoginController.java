package com.example.demo.controller;

import com.example.demo.model.UserModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LoginController
 * @Description
 * @Athour Lilan
 * @Date 2020/5/21 16:15
 **/
@RestController
@RequestMapping(value="test")
@Api(value = "登录controller",tags = "{登录接口}")
public class LoginController {

    @ApiOperation(value="登录",tags = "{登录系统}",notes = "注意")
    @GetMapping(value="/index")
    public String getUserInfo(@ModelAttribute UserModel model){
        return model.getName();
    }

    @ApiOperation(value="获取用户列表", notes="获取所有用户列表")
    @PostMapping(value="/getUserList")
    public List<UserModel> getUserList(@RequestBody UserModel model){
//        UserModel userModel = new UserModel();
//        userModel.setId(1);
//        userModel.setName("zhangsan");
        List<UserModel> list = new ArrayList<>();
        list.add(model);
        return list;
    }
}
