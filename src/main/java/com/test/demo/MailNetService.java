package com.test.demo;

import org.springframework.stereotype.Service;

@Service
@MailTypeHandler(value = MAILTYPE.NET)

public class MailNetService implements MailService {
    @Override
    public void handleEmail(MailInfo mailInfo) {
        System.out.println("MailNetService");
    }
}

