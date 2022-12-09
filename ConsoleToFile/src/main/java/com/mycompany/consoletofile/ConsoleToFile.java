/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.consoletofile;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author arseniyelefer
 */
public class ConsoleToFile {

    public static void main(String[] args) {

        try
        {
	    // Хранение текущего значения System.out перед присвоением нового значения 
            PrintStream console = System.out; 
	
            // Создание файла для выходных данных
            PrintStream fileOut = new PrintStream("./file.txt");

        System.out.println("Введите данные. Напишите exit для завершения программы");

            // Перенаправление вывода Console в файл
            System.setOut(fileOut);

            // Получение входных данных испульзуя Scanner из Console 
            Scanner scanner = new Scanner(System.in);

            // Чтение строки
	    // Написать exit для завершения программы
            String inputLine = scanner.nextLine();

            while(true)
            {

                // Если пользователь вводит 'выход' тогда прервать цикл
                if("exit".equalsIgnoreCase(inputLine))
                {
                    break;
                }

               System.out.println(inputLine); 
      
                // Получение текста со следующей строки ввода от пользователя
                inputLine = scanner.nextLine();
            }

            System.out.println("Программа прекращена ");

	    // Использовать сохранённое значение для вывода
            System.setOut(console); 
            System.out.println("Программа прекращена"); 

        }catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }


}