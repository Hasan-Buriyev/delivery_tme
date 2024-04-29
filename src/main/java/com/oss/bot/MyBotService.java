package com.oss.bot;

import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBotService {
    private final MyBot bot;


    public MyBotService(MyBot bot) {
        this.bot = bot;
    }

    public void onUpdateReceived(Update update) {

    }
}
