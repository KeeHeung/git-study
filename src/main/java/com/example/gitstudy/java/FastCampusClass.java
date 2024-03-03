package com.example.gitstudy.java;

public class FastCampusClass {
    public static void main(String[] args) {

        Month month = Month.JANUARY;

        switch (month) {
            case JANUARY: {
                System.out.println("1월 입니다.");
            }
            case FEBUARY: {
                System.out.println("2월 입니다.");
            }
            case MARCH: {
                System.out.println("3월 입니다.");
            }
            default: {
                System.out.println("기본입니다.");
            }
        }
    }
}
