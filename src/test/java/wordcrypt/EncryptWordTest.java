package wordcrypt;

import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptWordTest {
    @Test public void testEncryptReturnsString() throws Exception{
        EncryptWord encryptWord = new EncryptWord();
        assertEquals("klkwl4KGEJyQdKxbSdrFsQ==", encryptWord.encrypt("test", "1234567890abcdef"));
    }
}
