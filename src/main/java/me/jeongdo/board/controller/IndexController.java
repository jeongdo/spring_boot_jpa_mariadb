package me.jeongdo.board.controller;

import lombok.extern.slf4j.Slf4j;
import me.jeongdo.board.util.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("currentTime", DateUtil.getCurrentDate());
        return "index";
    }

}
