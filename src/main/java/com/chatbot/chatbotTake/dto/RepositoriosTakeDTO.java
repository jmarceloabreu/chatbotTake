package com.chatbot.chatbotTake.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
@NoArgsConstructor
public class RepositoriosTakeDTO implements Serializable {

    private Long id;
    private String language;
    private String name;
    private String description;
    private String created_at;
    private User owner;
}
