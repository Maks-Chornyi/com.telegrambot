package com.telegram.core;

import com.telegram.net.HttpClient;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BotMessage {
    private static final String TELEGRAM_RESOURCE = "https://api.telegram.org/bot703764327:AAFHQczOe1oB0o4XoVwxMalh2f48EpXDvO0";

    private final int chat_Id;
    private final String text;

    public void send() {
        HttpClient.post(TELEGRAM_RESOURCE + "/sendMessage", this);
    }
}
