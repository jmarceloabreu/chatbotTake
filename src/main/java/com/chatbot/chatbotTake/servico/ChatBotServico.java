package com.chatbot.chatbotTake.servico;

import com.chatbot.chatbotTake.dto.RepositoriosTakeDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public interface ChatBotServico {

    ResponseEntity<ListaRepositorioTake> buscaRepositoriosTake();

    @Getter
    @Setter
    @Data
    class ListaRepositorioTake implements Serializable {
        private List<RepositoriosTakeDTO> repositoriosTakeDTOList;

        public ListaRepositorioTake() {
            repositoriosTakeDTOList = new ArrayList<>();
        }
    }

}
