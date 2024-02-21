package com.ohgiraffers.section03_;

public class TV {

    // 필드 값 선언
    private String brand;
    private int year;
    private int inch;

    // 매개변수 생성자 만들기, {this 불러오기}
    public TV (String brand, int year, int inch){
        this.brand = brand;
        this.year = year;
        this.inch = inch;

    }
    public void show (){
        System.out.print(brand + "에서 만든" + year + "년" + inch + "인치");
    }

}
