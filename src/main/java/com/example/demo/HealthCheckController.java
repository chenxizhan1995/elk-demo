package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> Description: 健康检测接口</p>
 */
@RestController
@RequestMapping("/hello")
public class HealthCheckController {
    @RequestMapping("")
    public String hello(){
        return "hello, world";
    }
    /** 代码版本号
     *
     * @param version
     * @return
     */
    @RequestMapping("/version")
    public String version(@Value("${version}") String version) {
        return version;
    }

    /** 项目坐标
     *
     * @param artifact
     * @return 项目坐标
     */
    @RequestMapping("/artifact")
    public String artifact(@Value("${artifact}") String artifact) {
        return artifact;
    }

    /**
     * 启动用的环境（生产、测试、开发）
     * @param environment
     * @return
     */
    @RequestMapping(path = {"/environment", "/env"})
    public String environment(@Value("${spring.profiles.active}") String environment) {
        return environment;
    }

}
