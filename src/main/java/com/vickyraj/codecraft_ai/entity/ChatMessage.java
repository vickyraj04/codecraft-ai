package com.vickyraj.codecraft_ai.entity;

import com.vickyraj.codecraft_ai.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE )
public class ChatMessage {
    Long id;
    ChatSession chatSession;

    MessageRole role;

    String content;
    String toolCalls;

    Instant tokensUsed;

    Instant createdAt;
}
