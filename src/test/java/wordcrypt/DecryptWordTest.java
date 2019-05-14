package wordcrypt;

import org.junit.Test;
import static org.junit.Assert.*;

public class DecryptWordTest {
    @Test public void testDecryptReturnsString() throws Exception{
        DecryptWord decryptWord = new DecryptWord();
        assertEquals("test", decryptWord.decrypt("klkwl4KGEJyQdKxbSdrFsQ==", "1234567890abcdef"));
    }
}
