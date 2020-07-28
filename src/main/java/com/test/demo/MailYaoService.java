package com.test.demo;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Service;

@Service
@MailTypeHandler(value = MAILTYPE.YAHOO)
@CommonsLog
public class MailYaoService implements MailService {
    @Override
    public void handleEmail(MailInfo mailInfo) {
        log.info("MailYaoService");
    }
}
