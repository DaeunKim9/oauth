package com.people.findclothes.domain.constant;

public enum UserStatus {
    BASIC("일반"), SOCIAL("소셜"), ADMIN("관리자");

    private final String displayValue;

    UserStatus(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
