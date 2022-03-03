package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    JavaMailSender sender;
    public String helloWorld(String lang) {
        try {
        	System.out.println("in email service");
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setText("This message from Spring Boot Application");
            mailMessage.setSubject("Spring Boot Mail Message");
            mailMessage.setTo(lang);
            sender.send(mailMessage);
            return "Mail sent";
        } catch (MailException e) {
            e.printStackTrace();
            return "Mail not sent";
        }
    }
}

