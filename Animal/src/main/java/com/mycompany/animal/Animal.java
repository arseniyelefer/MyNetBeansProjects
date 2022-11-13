/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.animal;

/**
 *
 * @author Lenovo x270
 */
class Animal_2 {

  // поле name и метод askforfood родительского класса Animal_2
  String name;
  public void askForFood() {
    System.out.println("Человек, дай пожрать!");
  }
}

// наследование от Animal_2
class Dog extends Animal_2 {

  // новый метод printname в подклассе Dog
  public void printName () {
    System.out.println("Меня кличут " + name);
  }
}

// наследование от Dog
class Cat extends Dog {
String name;
  // новый метод introduceMyself в подклассе Dog
  public void introduceMyself () {
    System.out.println("Меня кличут " + name);
  }
}

public class Animal {
  public static void main(String[] args) {

    // создание объекта labrador подкласса Dog
    Dog labrador = new Dog();
    Cat mainkun = new Cat();

    // доступ к полю суперкласса
    labrador.name = "Белый Бим Чёрное ухо жёлтый кал серое брюхо";
    labrador.printName ();
    mainkun.name = ("Мурка");

    // вызов метода суперкласса
    // использование объекта подкласса
    labrador.askForFood();
    mainkun.introduceMyself();

  }
}