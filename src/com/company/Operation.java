package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Operation {
    public static void Plus(String a, String b) throws Exception {
        Chislo(a);
        String z = a + b ;
        if ( z.length() > 40) {
            String itog = z.substring(0,40);
            System.out.println(itog + "...");
        }
        else
            System.out.println(z);


    }

    public static void Umnojenie(String a, int b) throws Exception {
        if (b>10 || a.length()>10 ) {
            throw new Exception();
        }
        String result = "";
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        if (result.length()>40  ) {
            String itog = result.substring(0,40);
            System.out.println(itog + "...");
        }
        else
            System.out.println(result);
    }
    public static void Raznitsya (String[] name) throws Exception {

        String a ="";
        for(int i=0; i<name.length;i++) {
            if (name[i].equals("-") ) {
                break;
            }
            else {
                a = a+name[i]+ " " ;
            }
        }
        a=a.trim();
        Chislo(a);
        String razn = a.replace(name[name.length-1],"");

        if (razn.length()>40  ) {
            String itog = razn.substring(0,40);
            System.out.println(itog + "...");
        }
        else
            System.out.println(razn);

    }

    public static void Deleniye (String s,int d) throws Exception {
        if (d>10 || s.length()>10 ) {
            throw new Exception();
        }
        int dlina =s.length();
        String result =s.substring(0,dlina/d);
        if (result.length()>40  ) {
            String itog = result.substring(0,40);
            System.out.println(itog + "...");
        }
        else
            System.out.println(result);
    }
    public static void Chislo (String x ) throws Exception {

        String[] y = {"0","1","2","3","4","5","6","7","8","9"};
        for (int i =0; i < y.length; i++){
            if (x.equals(y[i])) {
                throw new Exception();
            }
        }
    }
}
