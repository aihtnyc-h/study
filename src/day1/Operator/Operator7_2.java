package day1.Operator;

class Operator7_2 {
    public static void main(String[] args) {
        int num1 = 8, num2 = -8;
        System.out.println("8의 2진수 = " + Integer.toBinaryString(num1)); // 0 생략 가능!
        System.out.println("-8의 2진수 = " + Integer.toBinaryString(num2));
        System.out.println("-9의 2진수 = " + Integer.toBinaryString(-9)); // 32bit, int = 4byte

        // 00000000000000000000000000001000 ,  8
        // 11111111111111111111111111111000 , -8
        System.out.println("& 연산자에 의한 결과 = " + (num1 & num2)); // 00000000000000000000000000001000, 8
        System.out.println("| 연산자에 의한 결과 = " + (num1 | num2)); // 11111111111111111111111111111000, -8
        System.out.println("^ 연산자에 의한 결과 = " + (num1 ^ num2)); // 11111111111111111111111111110000, -16

        System.out.println("~ 연산자에 의한 결과 = " + ~num1); // 11111111111111111111111111110111, -9

        System.out.println("<< 연산자에 의한 결과 = " + (num1 << 2)); // 32
        System.out.println(">> 연산자에 의한 결과 = " + (num2 >> 2)); // -2

        System.out.println(">>> 연산자에 의한 결과 = " + (num2 >>> 2)); // 1073741822
    }
}
