package com.people.findclothes.oauth2.user;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OAuth2Provider {
    GOOGLE("google");

    private final String registrationId;

    OAuth2Provider(String registrationId) {
        this.registrationId = registrationId;
    }
}