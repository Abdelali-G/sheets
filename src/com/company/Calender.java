package com.company;
import java.util.Scanner;

public class Calender {

    int FirstDayOfTheYear;
    int Year;
    String[] Month= {"January","February","March","April","May","June","July",
            "August","September","October","November","December"};

    public Calender(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first day of the year and the year ");
        System.out.println("Note : Sat is 1 and Fri is 7 ");
        System.out.println("Enter FirstDay");
        this.FirstDayOfTheYear = input.nextInt();


        System.out.println("Enter  the year");
        this.Year = input.nextInt();



    }
    void ShowCalender(){
        for(int i =0 ; i < 12; i++){

            System.out.println( "\n-----------------------------------------------\n " +
                    Year +"   "+ Month[i] + "\n-----------------------------------------------\n " +
                    "Sun    Mon    Tue    Wed    Thu    Fri    Sat");

        }

    }




}
