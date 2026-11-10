package com.example.firstAI.service;

import dev.langchain4j.service.spring.AiService;

@AiService
public interface JavaAiService {
    String chat(String message);
}
