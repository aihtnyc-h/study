package day1.Operator;

class Operator8_2 {
    public static void main(String[] args) {
        int num1 = 7, num2 = 7, num3 = 7;

        num1 = num1 - 3;
        num2 -= 3;
        num3 =- 3;

        System.out.println("- 연산자에 의한 결과 : "+ num1); // 4
        System.out.println("-= 연산자에 의한 결과 : "+ num2); // 4

        // = 위치를 주의하셔야 합니다.
        // num3 =- 3; 는 num3 = -3 입니다.
        System.out.println("=- 연산자에 의한 결과 : "+ num3); // -3
    }
}
