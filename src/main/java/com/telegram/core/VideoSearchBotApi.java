package com.telegram.core;

public class VideoSearchBotApi implements UpdateHandler{


    @Override
    public void onUpdate(Update update) {
        int chat_id = update.getMessage().getChat().getId();
        String text = update.getMessage().getText();
        String user = update.getMessage().getChat().getFirst_name();

        new BotMessage(chat_id, text + " - " + user).send();
    }
}
