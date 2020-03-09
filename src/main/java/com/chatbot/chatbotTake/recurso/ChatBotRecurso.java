package com.chatbot.chatbotTake.recurso;


import com.chatbot.chatbotTake.dto.RepositoriosTakeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ChatBotRecurso {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/repositories")
    public List<RepositoriosTakeDTO> repositories(HttpServletRequest httpServletRequest) {

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", httpServletRequest.getHeader("User-Agent"));

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<RepositoriosTakeDTO[]> response = restTemplate.exchange("https://api.github.com/orgs/takenet/repos", HttpMethod.GET, entity, RepositoriosTakeDTO[].class);
        List<RepositoriosTakeDTO> list = Arrays.asList(response.getBody());
        List<RepositoriosTakeDTO> listaRepositoriosCSharp = new ArrayList<>();
        list.forEach(repositorio -> {
            if(repositorio.getLanguage() != null && repositorio.getLanguage().equals("C#") && listaRepositoriosCSharp.size() < 5) {
                listaRepositoriosCSharp.add(repositorio);
            }
        });
        return listaRepositoriosCSharp;
    }
}
