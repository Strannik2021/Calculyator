package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String [] st = a.split(" ");
       switch (st[1]) {
           case "+":
               Operation.Plus(st[0],st[2]);
               break;
           case "*":
               Operation.Umnojenie(st[0],Integer.parseInt(st[2]));
               break;
           case "/":
               Operation.Deleniye(st[0],Integer.parseInt(st[2]));
               break;
       }
       for (int i=0; i < st.length; i++) {
           if (st [i].equals("-")  ) {
               Operation.Raznitsya(st);
                }
       }
    }
}
