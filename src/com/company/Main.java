package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();

        for (int i=1;i<=angka;i++){
            for(int j=angka+1;j>=i;j--){
                System.out.print("0");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            for(int x=angka+1;x>=i;x--){
                System.out.print("0");
            }
            System.out.println();
        }
        for (int i=1;i<=angka+1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("0");
            }
            for(int z=angka+1;z>=i;z--){
                System.out.print("*");
            }
            for(int k=angka;k>=i;k--){
                System.out.print("*");
            }
            for(int x=1;x<=i;x++){
                System.out.print("0");
            }
            System.out.println("");
        }

    }

}