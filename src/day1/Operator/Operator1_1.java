package day1.Operator;

class Operator1_1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // + 연산자는 피연산자가 2개인 이항 연산자 임으로 단항 연산자인 -x 의 -가 먼저 실행된다.
        System.out.print("-x + 3 = ");
        System.out.println(-x + 3); // -10 + 3 = -7

        System.out.print("x + 3 * y = ");
        System.out.println(x + 3 * y); // 10 + (3 * 20) = 70

        System.out.print("x + 3 > y - 2 = ");
        System.out.println(x + 3 > y - 2); // false
        System.out.print("x + 3 < y - 2 = ");
        System.out.println(x + 3 < y - 2); // true

        System.out.print("x > 3 && y < 2 = ");
        System.out.println(x > 3 && y < 2); // false

        int result = x + y * 3;
        System.out.println("result = " + result); // 10 + (20 * 3), result = 70
    }
}