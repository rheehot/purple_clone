package cyphers.cyphercharacters.service;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.EventRecodingLogger;
import org.springframework.stereotype.Service;

@Service
public class CharactersService {

    Logger logger = LoggerFactory.getLogger(CharactersService.class);
    // api key가 이곳에 저장된 상태다.
    String apiUrl = "https://api.neople.co.kr/cy/characters?apikey=";
    String apiKey = "g62cNYX1SvGwVAFXQlmuXviDmHFmX7zK";
    String requestURL = apiUrl + apiKey;

    // request URL을 반환하는 함수를 생성한다.
    public String getCharactersURL() {

        logger.info("service done!"); // info로 해야 출력됨


        return requestURL;
    }
}
