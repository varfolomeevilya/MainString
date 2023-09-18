package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//class MoneyTest {
//  Money money =new Money( 10, (byte) 15);
//  @BeforeEach
//  void init(){
//      money.setKopecks((byte) 15);
//      money.setHryvnia(10);
//  }
//    @Test
//    void getHryvnia() {
//        assertEquals(10,  money.getHryvnia());
//    }
//
//    @Test
//    void getKopecks() {
//      assertEquals(15, money.getKopecks());
//    }
//
//    @Test
//    void setKopecks() {
//      money.setKopecks((byte) 15);
//      assertEquals(15, money.getKopecks());
//    }
//
//    @Test
//    void setHryvnia() {
//      money.setHryvnia(10);
//      assertEquals(10, money.getHryvnia());
//    }
//
//    @Test
//    void plus() {
//      Money result= new Money(money.getHryvnia() + money.getHryvnia(), money.getKopecks());
//    }
//
//    @Test
//    void minus() {
//        Money result= new Money(money.getHryvnia() - money.getHryvnia(), money.getKopecks());
//    }
//
//    @Test
//    void multiplication() {
//        Money result= new Money(money.getHryvnia() * money.getKopecks(),  (byte) (money.getHryvnia() * money.getKopecks()));
//
//    }
//
//    @Test
//    void dvision() {
//        Money result= new Money(money.getHryvnia() * money.getKopecks(),  (byte) (money.getHryvnia() * money.getKopecks()));
//    }
//
//    @Test
//    void comparison() {
//      if(money.getHryvnia() < money.getKopecks() ){
//
//      }
//    }
//}