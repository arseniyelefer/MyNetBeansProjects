/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.evenoroddnumber;

/**
 *
 * @author Lenovo x270
 */
import java.util.Scanner;

public class EvenORoddNUMBER {

    public static void main(String[] args) {
        
        Scanner inputnumber = new Scanner(System.in);
                
        System.out.println("введите число: ");
        int number = inputnumber.nextInt();
                
                if (number%2==0) 
                    System.out.println(number+" это чётное число"); //тогда если число чётное
                else
                    System.out.println(number+" это нечётное число"); //иначе число нечётное
    }
}
