package com.company;

import java.util.Scanner;

public class Exit {
     public void TestExit () {
         System.out.println("Введите слово: ");
         Scanner scanner = new Scanner(System.in);
         while (true) {
         String str = scanner.next();
         System.out.println(str);
         if ("exit".equals(str)) {
             break;
         }
             System.out.println("Пользователь ввел: "+ str);
             System.out.println("Введите следующее слово");
         }

     }

}
