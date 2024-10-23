package com.example.elastic_logs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class LogController {

    private static final Logger logger = Logger.getLogger(LogController.class.getName());

    @RequestMapping("/logapi")
    public String logMethod() {
        logger.info("Hello from");
        logger.info("Hello from");
        logger.info("Hello from");
        logger.info("Hello from");

        return "Hello GoodBye";
    }

}
