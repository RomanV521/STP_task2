package com;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int h=random.nextInt(100)+100; //random number(100..200)
        int t1, k, t2;
        int n;
        int[] a = new int[h];
        System.out.println(h);

        for(int i=0; i<h; i++){
            a[i]=random.nextInt(10)+1; //random number(1..10)
            System.out.print(" "+a[i]);
        }

        System.out.print("\nВведите количество повторов N: ");
        n=scanner.nextInt();
        System.out.print("\nВведите количество элементов K: ");
        k=scanner.nextInt();

        while (n>0){
            t1 = random.nextInt(h-k);//задаем начальную точку
            t2 = k+t1;//конечная точка
            //System.out.print(" "+t1);
            if(t2>=h-5){
                while (t1<=t2){
                    a[t1]=a[t1-3];
                    t1++;
                }
            }
            else {
                if (t2<=5){
                    while (t1<=t2){
                        a[t1]=a[t1+4];
                        t1++;
                    }
                }
            }
            n--;
            System.out.println(" ");
            for(int i=0; i<h; i++){
                System.out.print(" "+a[i]);
            }
        }
    }
}
