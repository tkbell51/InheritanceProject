package com.company;

public class Main {

    public static void main(String[] args) {
	EmailNotification emailNotification = new EmailNotification(
	        "Inheritance",
            "Main topic for Java class today",
            "Joel Taddei",
            "@theironyard"
            );
	emailNotification.transport();
	TextNotification text = new TextNotification(
	        "inheritance :D",
            ":D >D ;| --^-^--",
            "joel taddei",
            "@theironyard"
    );
    text.transport();
        try {
            emailNotification.clone();
            Object emailNotificationClone = emailNotification.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        emailNotification.equals(emailNotification);
    }
}
