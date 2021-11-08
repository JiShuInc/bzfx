package com.cardinal.tech.bzfx.config.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SysInitConfig implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

    }
}
