package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıda ki formüle göre kullanıcının
        "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Kilo (kg) / Boy(m) * Boy(m)
         */
        Scanner input =new Scanner(System.in);
        System.out.println("vücut kitle endeksi hesaplama");
        System.out.println("lütfen boyunuzu giriniz(cm cinsiden yazınız)");
        int kilo;
        double boy,vucutKitle;
        boy =input.nextDouble();
        boy/=100;
        System.out.println("lütfen kilonuzu giriniz");
        kilo=input.nextInt();
        vucutKitle=(kilo/boy)*100;
        System.out.println(vucutKitle);





    }
}
