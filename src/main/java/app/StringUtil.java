package app;

public class StringUtil {

    public static void reverseString(Character[] c) {
        if (c == null) {
            throw new IllegalArgumentException("Character array must be not null");
        }

        if( c.length < 1 || c.length > Math.pow(10, 5)){
            throw new IllegalArgumentException("Length of array must less than zero and not over 10^5");
        }

        int startIndex = 0;
        int endIndex = c.length - 1;
        while (endIndex > startIndex) {
            char temp = c[startIndex];
            c[startIndex] = c[endIndex];
            c[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

}
