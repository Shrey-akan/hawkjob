package com.jobsite.oragejobsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobsite.oragejobsite.service.EmailService;


@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-email")
    public String sendEmail() {
        String to = "bashwani188@gmail.com";
        String subject = "Hello, Spring Email";
        String text = "This is a test email sent using Spring Boot.";

        emailService.sendEmail(to, subject, text);

        return "Email sent successfully!";
    	
    }
}
