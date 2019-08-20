package com.example.test.control;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/test")
    public ModelAndView test(Model model){
        model.addAttribute("msg","欢迎来到最全微商平台");
        model.addAttribute("user","我是使用者张鑫");
        model.addAttribute("mo","这里是热更新的部署位置");
        model.addAttribute("mm","刚刚没有成功，再来试一次");
        model.addAttribute("mq","多来几次才知道对不对，反正前面没有对");
        model.addAttribute("mma","我又右右右来试一次了0.0");
        return new ModelAndView("test","",model);
    }

    @GetMapping("/list")
    public List<String> getJson(){
        List<String> list=new ArrayList<>();
        list.add("work");
        list.add("java");
        list.add("web");
        return list;
    }
}
