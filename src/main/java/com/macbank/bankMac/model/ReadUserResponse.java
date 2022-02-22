package com.macbank.bankMac.model;

public class ReadUserResponse {

    private String id;

    private String username;

    private Double balance;

    public ReadUserResponse(String id, String username, Double balance) {
        this.id = id;
        this.username = username;
        this.balance = balance;
    }

    public ReadUserResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
