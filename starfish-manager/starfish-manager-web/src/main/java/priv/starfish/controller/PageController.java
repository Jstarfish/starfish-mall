package priv.starfish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * Created by starfish on 2017/10/18.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    //展示其他页面
    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page) {
        return page;
    }
}
