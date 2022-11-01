package org.example;

import java.util.Scanner;

public class Main {

        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.print("sayiyi giriniz :");
            int sayi = scan.nextInt();
            terscevir(sayi);
        }
        public static void terscevir ( int sayi){

            while (sayi > 0) {
                System.out.print(sayi % 10);
                sayi /= 10;
            }

        }

}
