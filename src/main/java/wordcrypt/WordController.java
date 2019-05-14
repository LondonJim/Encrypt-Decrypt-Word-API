package wordcrypt;

import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
    @RequestMapping("/encrypt")
    public EncryptWord encryptWord(@RequestParam Map<String,String> requestParams) throws Exception {
        String wordToEncrypt=requestParams.get("wordToEncrypt");
        String createdKey=requestParams.get("key");

        EncryptWord encryptWord = new EncryptWord();
        encryptWord.encrypt(wordToEncrypt, createdKey);
        return encryptWord;
    }

}
