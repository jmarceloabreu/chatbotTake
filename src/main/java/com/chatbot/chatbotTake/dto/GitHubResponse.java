package com.chatbot.chatbotTake.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
class GitHubResponse<T> implements Serializable {
    private List<T> items = new ArrayList<>();
}
