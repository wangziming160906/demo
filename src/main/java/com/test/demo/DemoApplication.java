package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private MessageServiceContext messageServiceContext;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MailInfo mailInfo = new MailInfo("YAHOO", "DFDF");
        MailInfo mailInfo1 = new MailInfo("NET", "DFDF");
        MailService mailService = messageServiceContext.getMessageService(mailInfo.getType());
        mailService.handleEmail(mailInfo);
        MailService mailService1 = messageServiceContext.getMessageService(mailInfo1.getType());
        mailService1.handleEmail(mailInfo1);
    }
}
