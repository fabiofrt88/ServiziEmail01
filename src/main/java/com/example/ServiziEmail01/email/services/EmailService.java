package com.example.ServiziEmail01.email.services;

import com.example.ServiziEmail01.student.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendTo(String email, String title, String text) {
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(email);
        sms.setFrom("marcoverdidev@gmail.com");
        sms.setTo(title);
        sms.setTo(text);
        emailSender.send(sms);
    }
}
