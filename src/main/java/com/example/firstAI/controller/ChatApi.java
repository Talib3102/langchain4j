package com.example.firstAI.controller;

import com.example.firstAI.service.JavaAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class ChatApi {

    private JavaAiService chatservice;
    public ChatApi(JavaAiService chatservice){
        this.chatservice=chatservice;
    }

    @GetMapping
    public String cha(
            @RequestParam String message){
        return chatservice.chat(message);
    }
}
