package app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        
        Character[] charArray = {'G','O','O','G','L','E'};
        System.out.println("Original : " + Arrays.toString(charArray));
        StringUtil.reverseString(charArray);
        System.out.println("Reversed : " + Arrays.toString(charArray));

    }
}
