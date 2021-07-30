package com.engeto;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static com.engeto.Season.*;

public class Main{

    public static boolean getLeapYear(){
        Scanner sc1 = new Scanner(System.in);
        boolean leap;
        System.out.print("Enter the year:");
        int year = sc1.nextInt();
<<<<<<< HEAD
        if (Year.of(year).isLeap())
            leap = true;
        else
            leap = false;
        return leap;
=======
        return Year.of(year).isLeap();
>>>>>>> 1620cb3 (Initial commit)

    }
    public static int[] getFibonnacci(){
        int [] array = new int[8];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2;i< array.length;i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }

    public static String getRating(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your grade:");
        int grade = sc1.nextInt();
        String great = "Výborně";
        String praiseworthy = "Chvalitebně";
        String good= "Dobře";
        String sufficiently = "Dostatečně";
        String insufficient = "Nedostatečně";
        String none = "This is not an estimate";
        if (grade == 1)
            return great;
        else if (grade == 2)
            return praiseworthy;
        else if (grade == 3)
            return good;
        else if (grade == 4)
            return sufficiently;
        else if (grade == 5)
            return insufficient;
        else
            return none;
    }

    public static void getSeason(Season season){

        String summer = "Leto";
        String winter = "Zima";
        String autumn = "Podzim";
        String spring = "Jaro";


        switch (season) {
            case JARO:
                System.out.println(spring);
                break;
            case LETO:
                System.out.println(summer);
                break;
            case ZIMA:
                System.out.println(winter);
                break;
            case PODZIM:
                System.out.println(autumn);
                break;
            default:
                break;
        }
     }
    public static void getSeason2() {

        String summer = "Leto";
        String winter = "Zima";
        String autumn = "Podzim";
        String spring = "Jaro";
        Calendar date = Calendar.getInstance();
        int Mounth;

        if ((date.get(Calendar.MONTH) == 6) || (date.get(Calendar.MONTH) == 7) || (date.get(Calendar.MONTH) == 8))
            System.out.println(summer);
        else if ((date.get(Calendar.MONTH) == 9) || (date.get(Calendar.MONTH) == 10) || (date.get(Calendar.MONTH) == 11))
            System.out.println(autumn);
        else if ((date.get(Calendar.MONTH) == 12) || (date.get(Calendar.MONTH) == 1) || (date.get(Calendar.MONTH) == 2))
            System.out.println(winter);
        else if ((date.get(Calendar.MONTH) == 3) || (date.get(Calendar.MONTH) == 4) || (date.get(Calendar.MONTH) == 5))
            System.out.println(spring);
        }

        public static void main(String[] args) {
        boolean thisYear = getLeapYear();
        System.out.println (thisYear);
        for (int i = (getFibonnacci().length-1); i >= 0; i--){
            System.out.println(getFibonnacci()[i]);
        }
        System.out.println(getRating());
        getSeason(JARO);
        getSeason2();
                    }
}
