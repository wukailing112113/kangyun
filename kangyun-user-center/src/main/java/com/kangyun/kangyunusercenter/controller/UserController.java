package com.kangyun.kangyunusercenter.controller;

import com.kangyun.kangyunusercenter.config.ConsulConfigDemo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户接口")
//@Log4j2
@RestController
@RequestMapping("/user")
public class UserController {

//    @Value("${name}")
//    private String name;

    @Autowired
    private ConsulConfigDemo consulConfigDemo;

    @ApiOperation(value = "获取用户", notes = "根据id查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", required=true, dataType = "String")
    @ResponseBody
    @GetMapping(value = "/queryUser")
    public String test(String id){
        return "hello,kangyun:"+id;
    }

    @ResponseBody
    @RequestMapping("/config")
    public String testConfig() {
        System.out.println(consulConfigDemo.toString());
        return consulConfigDemo.toString();
    }
}
