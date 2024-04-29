package com.oss.model.enums;

public enum UserState {
    USER_STARTED(1),
    CHOOSE_LANGUAGE(2),
    SHARE_PHONE_NUMBER(3),
    MANU(4);
    private final int step;

    UserState(int step) {
        this.step = step;
    }
    public static UserState getByStep(int step) {
        return values()[step-1];
    }
}
