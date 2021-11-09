package com.company;
import java.util.Scanner;

public class Calender {

    int FirstDayOfTheYear;
    public Calender(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first day of the year and the year ");
        System.out.println("Note : Sat is 1 and Fri is 7 ");
        System.out.println("Enter FirstDay");
        int FirstDay = input.nextInt();


        System.out.println("Enter  the year");
        int Year = input.nextInt();
        for(int i =0 ; i < 12; i++){

            System.out.println( "\n-----------------------------------------------\n " +
                    Year + "\n-----------------------------------------------\n " +
                    "Sun    Mon    Tue    Wed    Thu    Fri    Sat");

        }



    }




}
