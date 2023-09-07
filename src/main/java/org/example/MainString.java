package org.example;

public class MainString {


    private char[] chars;
    private int n;

    private String str=new String();

    public MainString(){

      this.n=1;
    }
    public MainString(char[] chars, int n){
        this.chars=chars;
        this.n=str.length();
    }
    public char[] getChars() {
        return chars;
    }
    public int getN() {
        return n;
    }
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void setChars(char[] chars) {
        this.chars = chars;
    }
    public void indexof(){
        String str= new String();
        int n=str.length();
        int indexOf= str.indexOf("v");
        System.out.println(indexOf);
    }
}
