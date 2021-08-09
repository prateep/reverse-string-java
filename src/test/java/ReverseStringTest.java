import org.junit.jupiter.api.Test;

import app.StringUtil;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Assertions;


class ReverseStringTest {

    @Test
    void testReverseCharacterArray() {
        Character[] charArray = {'G','O','O','G','L','E'};
        StringUtil.reverseString(charArray);
        assertArrayEquals(charArray, new Character[]{'E', 'L', 'G', 'O', 'O', 'G'});
    }


    @Test
    void testExpectedExceptionFail() {
        // Code does not throw any exception
        // This assetion will fail
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.reverseString(null);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.reverseString(new Character[]{});
        });

    }
}
