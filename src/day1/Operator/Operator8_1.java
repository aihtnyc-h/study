package day1.Operator;

class Operator8_1 {
    public static void main(String[] args) {
        int num1 = 5, num2 = 7;
        int result;

        result = num1 - num2 > 0 ? num1 : num2;

        System.out.println("두 정수 중 더 큰 수는 " + result + "입니다."); // 7
    }
}