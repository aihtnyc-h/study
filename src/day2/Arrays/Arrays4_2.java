package day2.Arrays;

import java.util.Arrays;

class Arrays4_2 {
    public static void main(String[] args) {
        String[] strArr = {"축구", "야구", "골프", "테니스"};
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        String[] strArr2 = new String[4];
        System.out.println("Arrays.toString(strArr2) = " + Arrays.toString(strArr2));
    }
}

/*
String[] name = new String[3];
3개의 문자열을 담을 수 있는 배열 생성
참조형이기 때문에 기본값 null로 초기화됨
 */