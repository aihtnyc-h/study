package day1.Variable;

import java.util.Date;

class Variable3_5 {
    public static void main(String[] args) {
        // Date import 필요!
        Date date; // 참조형 변수 date 를 선언
        date = new Date(); // date 에 객체의 주소를 저장 , new 는 객체를 생성하는 명령어

        System.out.println(date); // Wed Jan 11 20:54:45 KST 2023
    }
}