package com.ohgiraffers.section04_;

public class Application {

    public static void main(String[] args) {

        //1978년 스웨덴국적의 ABBA가 부른 Dancing Queen

//        Song sisi = new Song(1978,"스웨덴","ABBA","Dancing Queen");      //매개생성자
        Song sisi = new Song();                                         // 기본생성자
        sisi.setYear(1978);
        sisi.setNationality("스웨덴");
        sisi.setSinger("ABBA");
        sisi.setTitle("Dancing Queen");


        sisi.song();            //출력해라~

        }
    }


// ★ 기본생성자(값) 일때