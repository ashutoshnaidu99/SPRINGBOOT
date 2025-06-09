package com.chat.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.util.pattern.PathPattern;


@Data
@NoArgsConstructor
public class ChatMessage {
    private Long id;
    private String sender;
    private String context;
}
