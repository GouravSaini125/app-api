package com.example.test;

public class Choice {

    private String a;
    private String b;
    private String c;
    private String d;
    private String answer;

    public Choice(String a,String b,String c,String d, String answer){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.answer = answer;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public String getAnswer() {
        return answer;
    }

}
