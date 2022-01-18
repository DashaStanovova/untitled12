package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.valueOf(scanner.nextLine());
        String str = scanner.nextLine();
        String[] str1=str.split(" ");
        int[] array=new int [num];
        for(int i=0;i<array.length;i++) {
            array[i] = Integer.valueOf(str1[i]);
        }
        int count=0;
int[] array1=new int[array.length];
        for(int i=0; i<array.length; i++){
            if(array[i]!=0) {
                array1[count]=array[i];
                count=count+1;
            }

            }
        for (int k=0; k<array.length;k++){
            System.out.print(array1[k]);
        }
        }
    }
