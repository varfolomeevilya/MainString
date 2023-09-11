package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainStringTest {
    MainString mainString=new MainString("fghggfgf", 12);
    @BeforeEach
    void init(){
        mainString.setStr("f");
        mainString.setN(12);
        mainString.setChars(null);
    }
    @Test
    void getChars() {
        assertEquals(null, mainString.getChars());
    }

    @Test
    void getN() {
        assertEquals(12, mainString.getN());
    }

    @Test
    void getStr() {
        assertEquals("f", mainString.getStr());
    }

    @Test
    void setStr() {
        mainString.setStr("vn");
        assertEquals("vn", mainString.getStr());
    }

    @Test
    void setN() {
        mainString.setN(12);
        assertEquals(12, mainString.getN());
    }

    @Test
    void setChars() {
        mainString.setChars(null);
       assertEquals(null, mainString.getChars());
    }

    @Test
    void clear() {
        String str=new String();
        int n=str.length();
        String output=new String();
    }

    @Test
    void length() {
        String str="ghffhg";
        int length=str.length();
        System.out.println("Длина строки" + length);
    }

    @Test
    void indexof() {
        String str=new String();
        int n=str.length();
        int indexOf=str.indexOf("vg");
        System.out.println(indexOf);
    }
}