package com.chatbot.chatbotTake.servico.impl;

import com.chatbot.chatbotTake.servico.ChatBotServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatBotServicoImpl implements ChatBotServico {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<ListaRepositorioTake> buscaRepositoriosTake () {
        return restTemplate.getForEntity(String.format("https://api.github.com/orgs/takenet/repos"), ChatBotServico.ListaRepositorioTake.class);

    }
}
