import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressionTest {

    @org.junit.jupiter.api.Test
    void testCompress() {
        StringCompression stringCompression = new StringCompression();
        assertEquals(6, StringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }
}