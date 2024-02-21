package com.ohgiraffers.section04_;

public class Song {

    // 필드 값 선언하기
    private int year;
    private String nationality;
    private String singer;
    private String title;

    // 매개변수 및 {this}

    public Song() {                 // 기본 생성자
//        this.year = year;
//        this.nationality = nationality;
//        this.singer = singer;
//        this.title = title;

    }
                                // 기본생성자: getter and setter
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //출력본

    public void song () {

        System.out.println(year + "년" + nationality + "의" + singer + "가 부른" + title);
    }


}

// ★ 매개생성자(값/getter and setter) 일떄