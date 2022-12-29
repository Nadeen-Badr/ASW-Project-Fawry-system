package com.example.demo.Payment;

import java.util.Scanner;

public class PaymentForm
{
    Scanner sc1 = new Scanner(System.in);

    String Form()
    {
        System.out.println(" you want pay cash,credit or by wallet");
        String str = sc1.next();
        if (str.equals("cash")) {
            return "Cash";
        } else if (str.equals("credit"))
            return "Credit";
        else if (str.equals("wallet"))
            return "wallte";
        else
          return "invalid" ;
    }
    /*
    void print()
    {

    }
     */

}
