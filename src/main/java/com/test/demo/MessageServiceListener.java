package com.test.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MessageServiceListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Map<String, Object> beans = event.getApplicationContext().getBeansWithAnnotation(MailTypeHandler.class);
        MessageServiceContext messageServiceContext = event.getApplicationContext().getBean(MessageServiceContext.class);
        beans.forEach((name, bean) -> {
            MailTypeHandler typeHandler = bean.getClass().getAnnotation(MailTypeHandler.class);
            messageServiceContext.putMessageService(typeHandler.value().code, (MailService) bean);
        });
    }
}
