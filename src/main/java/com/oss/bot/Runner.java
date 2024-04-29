package com.oss.bot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Runner {
    public static void main(String[] args) throws TelegramApiException {
        MyBot myBot=new MyBot(BotProperty.TOKEN);
        TelegramBotsApi telegramBotsApi=new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(myBot);
    }
}
