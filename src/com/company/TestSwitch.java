package com.company;

import java.util.Scanner;

public class TestSwitch {

    public void TestSwitchOperator() {
        Scanner scanner = new Scanner(System.in);
        String str =scanner.next();
        char vowels =str.charAt(0);
        switch (vowels) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            System.out.println("Буква " +vowels+ " является гласной");
            break;
        default: {
            System.out.println("Буква " +vowels+ " является согласной");
        }

        }
    }

}
