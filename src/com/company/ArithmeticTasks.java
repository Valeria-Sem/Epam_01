package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static java.lang.Math.*;

public class ArithmeticTasks {

    static int calculateSquareOfLastDigit (int numb){     // #1
        int lastDigit = numb % 10;
        return (int)(pow(lastDigit, 2) % 10);
    }

    static int calculateDaysInMonth(int year, int month){       // #2
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, --month);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    static boolean isLeapYear(int year) {   // #2
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
        return cal.isLeapYear(year);
    }

    static double areaOfSquare (double square){     // #3
        double squareSide = sqrt(square);
        double radius = squareSide/2;
        double square2 = 0.5 * pow(radius, 2) * 4;
        return square/square2;
    }

    static boolean findingPositiveNumbers(List<Integer> sequence){      // #4
        int count = 0;
        boolean positiveNumb = false;

        for(int seq: sequence){
            if (seq % 2 == 0)
                count++;
        }

        if (count >= 2)
            positiveNumb = true;

        return positiveNumb;
    }

    static boolean sum(int n) {     // #5
        int summa = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0)
                summa += i;
        }
        return summa == n;
    }

    static List<Integer> determiningTime(int nSec){     // #6
        int hour = nSec/3600;
        nSec -= hour * 3600;
        int min = nSec / 60;
        nSec -= min * 60;
        int sec = nSec;

        List<Integer> time = new ArrayList<>();
        time.add(hour);
        time.add(min);
        time.add(sec);

        return time;
    }

    static double calculatePointCoordinates(double x, double y){        // #7
        return sqrt(pow(x, 2) + pow(y, 2));
    }

    static double calculateFunction(double x){      // #8
        double F;

        if(x >= 3){
            F = pow(-x, 2) + 3 * x + 9;
        } else{
            F = 1 / (pow(x, 3) - 9);
        }
        return F;
    }

    static double calculateArea(double radius){     // #9
        return PI * pow(radius, 2);
    }

    static double calculateLengthOfCircle(double radius){       // #9
        return 2 * PI * radius;
    }

    static List<Double> F(double a, double b, double h){        // #10
        List<Double> f = new ArrayList<>();

        for(double x = a; x <= b; x += h){
            f.add(tan(x));
        }
        return f;
    }
}
