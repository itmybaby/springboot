package com.example.demo.config;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * @author :小虎
 * @date :2017/12/21
 */

@Component
public class ExitConfig implements ExitCodeGenerator {
    @Override
    public int getExitCode() {
        System.out.println("定义程序退出的退出码");
        return 1024;
    }
}
