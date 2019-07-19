package com.telegram.net;

import com.telegram.core.BotMessage;
import org.junit.Test;


public class HttpClientTest {

    @Test
    public void post() {
        HttpClient.post("https://api.telegram.org/bot703764327:AAFHQczOe1oB0o4XoVwxMalh2f48EpXDvO0/sendMessage",
                new BotMessage(408782690, "Hi there"));
    }
}