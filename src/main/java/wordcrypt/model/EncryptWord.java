package wordcrypt;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Base64.Encoder;

public class EncryptWord {
    private String encryptedWord;

    public String getEncryptedWord() {
        return encryptedWord;
    }

    public String encrypt(String strClearText,String strKey) throws Exception{
      byte[] encryptedBytes;
      try {
          SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"AES");
          Cipher cipher = Cipher.getInstance("AES");
          cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
          encryptedBytes = cipher.doFinal(strClearText.getBytes());
      } catch (Exception e) {
          e.printStackTrace();
          throw new Exception(e);
      }
      Encoder encoder = Base64.getEncoder();
      encryptedWord = encoder.encodeToString(encryptedBytes);
      return encryptedWord;
    }

}
