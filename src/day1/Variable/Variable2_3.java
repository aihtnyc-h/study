package day1.Variable;

class Variable2_3 {
public static void main(String[] args) {
        // boolean flag1 = 22; // Error 발생
        boolean flag2 = false; // true, false 만 가능!

        // char grade1 = 'AA'; // Error 발생
        // char grade2 = "A"; // Error 발생
        char grade3 = 'A'; // char 타입은 이렇게 하나의 문자만 가능!
        char ch = '\n'; // 개행문자(\n, \t 등) 가능!

        // String name1 = 'C'; // Error 발생
        // String name2 = 'Choi'; // Error 발생
        String str = "C"; // 한 문자 가능! 문자가 하나여도 문자열로 인식!
        String name3 = "choi"; // 여러 문자 가능!

        // byte val1 = 128; // Error 발생
        byte val2 = 127; // int 와 같은 리터럴로 저장하지만 범위가 지정되어 있음! -128 ~ 127

        short sval = 128;

        // 리터럴 접두사 예제
        // int의 진수 표현
        int ob = 0b0101; // 2진수, 접두사 0b
        int i = 100; // 10진수
        int oct = 0100; // 8진수, 접두사 0
        int hex = 0x100; // 16진수, 접두사 0x

        long price = 2_147_483_648L; // _ 를 사용하여 숫자 표현 가능!
        // long l1 = 2_147_483_648; // Error 발생, int 범위를 넘었으니 L 접미사 필수!
        long l2 = 100; // int의 범위를 넘지 않으면 L 생략 가능!

        // float tax1 = 3.14;
        float tax2 = 3.14f;

        double score1 = 3.14159265358979; // d 생략 가능!
        double score2 = 3.14159265358979d;

        float f1 = 10f; // 10.0f
        double d1 = 10.; // 10.0
        double d2 = .10; // 0.10
        double d3 = 1e3; // 1000.0 , e3 = 10의 3제곱
        double d4 = -1e3; // -1000.0
        }
        }