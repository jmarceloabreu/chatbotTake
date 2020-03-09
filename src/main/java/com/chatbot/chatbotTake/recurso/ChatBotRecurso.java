package com.chatbot.chatbotTake.recurso;


import com.chatbot.chatbotTake.dto.RepositoriosTakeDTO;
import com.chatbot.chatbotTake.servico.ChatBotServico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ChatBotRecurso {

    private final ChatBotServico chatBotServico;

    public ChatBotRecurso(ChatBotServico chatBotServico) {
        this.chatBotServico = chatBotServico;
    }

    @RequestMapping("/repositories")
    public List<RepositoriosTakeDTO> repositories(HttpServletRequest httpServletRequest) {
        return chatBotServico.buscaRepositoriosTake(httpServletRequest);
    }
}
