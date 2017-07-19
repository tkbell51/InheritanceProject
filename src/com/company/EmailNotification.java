package com.company;

import com.sun.tools.corba.se.idl.constExpr.Not;

/**
 * Created by TKB on 7/19/17.
 */
public class EmailNotification extends Notification{
    private String recipient;
    private String smtpProvider;


    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        setStatus("Email success");

    }
    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        super.transport();
        System.out.println("Email transport complete");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    public void printText() {
        super.printText();
        System.out.println("This is more text after the overridden text");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        EmailNotification emailNotificationClone = (EmailNotification)super.clone();
        return emailNotificationClone;
    }
}
