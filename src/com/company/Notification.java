package com.company;

import java.time.LocalDateTime;

/**
 * Created by TKB on 7/19/17.
 */
public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "success";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public abstract void transport() {
        try{
            throw new NoTransportException();
        } catch (NoTransportException ex){
            ex.printStackTrace();
            System.out.println("transport error");
        }
    }
    public void showStatus(){
        System.out.println("Status: " + this.getStatus());
    }
    protected void printText(){
        System.out.println("This is printing a notification;");
    }
}
