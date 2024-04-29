package com.oss.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyBot extends TelegramLongPollingBot {
    private Executor executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    private MyBotService myBotService = new MyBotService(this);

    public MyBot(String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        executor.execute(() -> {
            try {
                myBotService.onUpdateReceived(update);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public String getBotUsername() {
        return BotProperty.USERNAME;
    }
}
