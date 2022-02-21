package com.macbank.bankMac.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReadUserResponseTest {

    @Test
    public void shouldReturnResponse() {
        ReadUserResponse readUserResponse = new ReadUserResponse(12345L, "Janusz", 345.56D);
        assertThat(readUserResponse.getId()).isEqualTo(12345L);
        assertThat(readUserResponse.getUsername()).isEqualTo("Janusz");
        assertThat(readUserResponse.getBalance()).isEqualTo(345.56D);
    }

    @Test
    public void shouldNotReturnResponse() {
        ReadUserResponse readUserResponse = new ReadUserResponse(12345L, "Janusz", 345.56D);
        assertThat(readUserResponse.getId()).isNotEqualTo(12346L);
        assertThat(readUserResponse.getUsername()).isNotEqualTo("Januzs");
        assertThat(readUserResponse.getBalance()).isNotEqualTo(35.56D);
    }
}