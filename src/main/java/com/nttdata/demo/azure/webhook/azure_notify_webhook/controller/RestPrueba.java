package com.nttdata.demo.azure.webhook.azure_notify_webhook.controller;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/server-test")
public class RestPrueba {

    Logger logger = LoggerFactory.getLogger(RestPrueba.class);

    @GetMapping("/notify")
    public String testWebhookNotify() {
        logger.info("SE EJECUTO LA INVOCACIÓN DESDE EL WEBHOOK");
        return "OK";
    }

    @PostMapping("/notify")
    public String postTestWebhookNotify() {
        logger.info("POST SE EJECUTO LA INVOCACIÓN DESDE EL WEBHOOK");
        return "OK 2";
    }
}
