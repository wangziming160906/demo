package com.test.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class MailInfo {
    // 消息类型
    private String type;
    // 消息内容
    private String content;

}
