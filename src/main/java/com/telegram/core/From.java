package com.telegram.core;

import lombok.Getter;

@Getter
public class From {

    private int id;
    private boolean is_bot;
    private String first_name;
    private String last_name;
    private String language_code;
}
