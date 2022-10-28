package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 触发日志消息的接口
 *
 */
@RestController
public class LogController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/testlog")
    public Object testLog(){
        try {
            logger.info("Hello 这是 info message. 信息");
            logger.error("Hello 这是 error message. 报警");
            logger.warn("Hello 这是 warn message. 警告");
            logger.debug("Hello 这是 debug message. 调试");
            List<String> list = new ArrayList<>();
            System.out.println(list.get(2));
        } catch (Exception e) {
            logger.error("testLog", e);
        }
        return "ok";
    }
}
