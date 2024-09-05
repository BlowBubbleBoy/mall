package com.bubbleboy.admin.modules.sys.controller;

import com.bubbleboy.common.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页提示
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public Result<String> index(){
        String tips = "你好，renren-admin已启动，请启动renren-ui，才能访问页面！";
        return new Result<String>().ok(tips);
    }
}
