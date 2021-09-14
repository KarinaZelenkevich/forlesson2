package com.company;

import java.sql.SQLOutput;
import java.time.MonthDay;
import java.util.Scanner;

public class Month {

    public void TimeOfYear (){
        System.out.println("Введите месяц: ");
        Scanner scanner = new Scanner(System.in);
        String Month =scanner.nextLine();
        switch (Month) {
            case "Декабрь":

            case "Январь":

            case "Февраль":
               System.out.println("Это зима");
            break;

            case "Март":

            case "Апрель":

            case "Май" :
                System.out.println("Это весна");
                break;

            case "Июнь":

            case "Июль":

            case "Август" :
                System.out.println("Это лето");
                break;

            case "Сентябрь":

            case "Октябрь":

            case "Ноябрь" :
                System.out.println("Это осень");
                break;

            default:
                System.out.println("Попробуй еще раз");

        }

    }

}
