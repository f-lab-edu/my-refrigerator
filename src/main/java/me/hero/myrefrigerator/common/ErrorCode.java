package me.hero.myrefrigerator.common;

import lombok.Getter;

@Getter
public enum ErrorCode {
    SERVER_ERROR(999),
    CONSTRAINT_VIOLATION(401),
    INVALID_PARAM(402);

    private int code;

    ErrorCode(int code) {
        this.code = code;
    }
}
