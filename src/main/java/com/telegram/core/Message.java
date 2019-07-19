package com.telegram.core;

import lombok.Getter;

import java.util.Date;

@Getter
public class Message {


    private String message_id;
    private From from;
    private Chat chat;
    private Date date;
    private String text;

}
