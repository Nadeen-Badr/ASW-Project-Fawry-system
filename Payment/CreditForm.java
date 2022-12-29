package com.example.demo.Payment;

import java.util.Scanner;

public class CreditForm
{
    public String name;
    public String cardnumber;
    public  int cvv;
    void printCreditDetails()
    {
        Scanner sc11= new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc11.next();
        System.out.println("Enter cardNumber");
        String number=sc11.next();
        System.out.print("Enter cvv");
        int cvv=sc11.nextInt();
        this.name = name;
        this.cardnumber = number;
        this.cvv=cvv;
    }

}
