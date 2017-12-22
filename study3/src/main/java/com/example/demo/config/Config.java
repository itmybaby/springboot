package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :小虎
 * @date :2017/12/22
 */
@Component
@ConfigurationProperties(prefix="my")
public class Config {
    private String name;
    private Integer port;
    private List<String> servers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public List<String> getServers() {
        return servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }

    @Override
    public String toString() {
        return "Config{" +
                "name='" + name + '\'' +
                ", port=" + port +
                ", servers=" + servers +
                '}';
    }
}