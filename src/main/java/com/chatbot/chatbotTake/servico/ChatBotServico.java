package com.chatbot.chatbotTake.servico;

import com.chatbot.chatbotTake.dto.RepositoriosTakeDTO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ChatBotServico {

    List<RepositoriosTakeDTO> buscaRepositoriosTake(HttpServletRequest httpServletRequest);


}
