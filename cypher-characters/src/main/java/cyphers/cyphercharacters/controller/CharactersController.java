package cyphers.cyphercharacters.controller;

import cyphers.cyphercharacters.service.CharactersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CharactersController {
    Logger logger = LoggerFactory.getLogger(CharactersController.class);
    @Autowired
    private CharactersService charactersService;

    @GetMapping("/getCyphers")
    public String getCypherCharacters() {
        logger.debug("컨트롤러 진입!");
        // 서비스를 호출한다.
        // 서비스에서 받은 결과를 getCyphers.html로 전송해야 한다.
        String url = charactersService.getCharactersURL();
        logger.debug("컨트롤러 끝!");
        return "getCyphers";
    }
}
