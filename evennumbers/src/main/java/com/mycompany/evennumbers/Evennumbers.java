/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.evennumbers;

/**
 *
 * @author Lenovo x270
 */

public class Evennumbers {
        public static void main(String[] args) {
            System.out.println ("чётное число от 0 до 10: ");
            for(int number=0; number<=10; ++number) {
                //проверять, если число чётное
                if (number%2==0) {
                    System.out.println(number+" ");
                }
            }
                  
        }
    }