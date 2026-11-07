package com.zymshan.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String greet(){
        log.info("This is the first Log ------------ YAY!!!!..........");
        return "Welcome to Zymshan Webpage, we are here to learn Logging";
    }
}
