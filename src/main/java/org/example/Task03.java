package org.example;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args){
      Scanner scanner=new Scanner(System.in);
      long hryvnia= scanner.nextLong();
      byte kopecks= scanner.nextByte();
      Money money = new Money();
      money.setHryvnia(10);
      money.setKopecks((byte) 15);
      money.plus(money);
      money.minus(money);
      money.multiplication(money);
      money.dvision(money);
      money.comparison();
      System.out.print(money.getKopecks());
      System.out.print (money.getHryvnia());


    }
}
