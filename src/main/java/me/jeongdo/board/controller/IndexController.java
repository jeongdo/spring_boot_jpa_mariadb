package me.jeongdo.board.controller;

import lombok.extern.slf4j.Slf4j;
import me.jeongdo.board.mapper.TestMapper;
import me.jeongdo.board.service.TestService;
import me.jeongdo.board.util.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@Slf4j
public class IndexController {

    @Resource
    TestService testService;

    @RequestMapping("/")
    public String index(Model model) {
        String curDatabaseTime = testService.getCurDatabaseTime();
        log.info("================");
        log.info("{}", curDatabaseTime);
        log.info("================");

        model.addAttribute("currentTime", curDatabaseTime);
        return "index";
    }

}
