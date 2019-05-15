package wordcrypt;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Base64.Decoder;

public class DecryptWord {
    private String decryptedWord;

    public String getDecryptedWord() {
        return decryptedWord;
    }

    public String decrypt(String strEncrypted,String strKey) throws Exception{
        String strData;
        byte[] decodedBytes = Base64.getDecoder().decode(strEncrypted.getBytes());
        try {
            SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, skeyspec);
            byte[] decoded = cipher.doFinal(decodedBytes);
            strData = new String(decoded);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        decryptedWord = strData;
        return decryptedWord;
    }
}
