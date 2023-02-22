package com.company;

import java.util.*;
import java.util.Scanner;

class Main
{
    public static int calculateBill(int Units_consumed)
    {
        if (Units_consumed <= 100) {
            return Units_consumed * 10;
        }
        else if (Units_consumed <= 200) {
            return (100 * 10) + (Units_consumed - 100) * 15;
        }
        else if (Units_consumed <= 300) {
            return (100 * 10) + (100 * 15) + (Units_consumed - 200) * 20;
        }
        else if (Units_consumed > 300) {
            return (100 * 10) + (100 * 15) + (100 * 20) + (Units_consumed - 300) * 25;
        }
        return 0;
    }
    public static void main(String args[])
    {
        System.out.println("ENTER NAME:");
        Scanner aa= new Scanner(System.in);
        String name=aa.next();
        System.out.println("ENTER ADDRESS:");
        Scanner bb= new Scanner(System.in);
        String address=bb.next();
        System.out.println("ENTER MOTOR_ID:");
        Scanner cc= new Scanner(System.in);
        int motor_id=cc.nextInt();
        System.out.println("ENTER THE UNITS CONSUMED:");
        Scanner dd= new Scanner(System.in);
        int Units_consumed=dd.nextInt();

        System.out.println("NAME: "+name);
        System.out.println("ADDRESS: "+address);
        System.out.println("MOTOR ID: "+motor_id);
        System.out.println("UNITS CONSUMED: "+Units_consumed);

        System.out.println("CALCULATED BILL AMOUNT= Rs "+calculateBill(Units_consumed));
    }
}