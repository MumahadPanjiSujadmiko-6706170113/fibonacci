package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);
        int n;

        System.out.print("Masukan Jumlah Deret ");
        n =show.nextInt();

        for (int i = 1; i <=n ; i++) {
            int x = cari(i);
            System.out.print(x+"");

        }

    }
    public static int cari(int n){
        if (n == 1||n == 2){
            return 1;
        }else{
            return cari(n - 1)+ cari(n - 2);
        }
    }

}
