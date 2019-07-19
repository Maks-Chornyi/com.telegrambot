package com.telegram.core;

import com.telegram.core.Message;
import lombok.Getter;

@Getter
public class Update {

    private int update_id;
    private Message message;

}
