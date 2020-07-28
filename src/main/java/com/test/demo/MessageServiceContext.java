package com.test.demo;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class MessageServiceContext {

    private final Map<String, MailService> handlerMap = new HashMap<>();

    public MailService getMessageService(String type) {
        return handlerMap.get(type);
    }
    public void putMessageService(String code, MailService messageService) {
        handlerMap.put(code, messageService);
    }

}
