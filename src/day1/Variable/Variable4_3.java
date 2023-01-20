package day1.Variable;

class Variable4_3 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        // x 와 y 값을 교환해 보겠습니다.
        x = y; // x = 20;
        // 변수는 하나의 값 밖에 저장할 수 없기 때문에 기존의 x의 값 10은 사라지고 20이 됩니다.
        y= x; // y = 20;
        // y는 20 이된 x의 값을 받습니다.

        System.out.println("x = " + x); // 20
        System.out.println("y = " + y); // 20

        System.out.println();
        // 교환이 제대로 되지 않았습니다!

        int a = 10, b = 20;
        int tmp; // 교환에 중간다리 역할을 해 줄 변수 하나를 선언합니다.
        // a 와 b 값을 교환해 보겠습니다.
        tmp = a; // a = 10, tmp = 10
        a = b; // b = 20, a = 20
        b = tmp; // tmp = 10, b = 10

        // 결과로 a = 20, b = 10 이어야 됩니다.
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10
        System.out.println("tmp = " + tmp); // 10

        // 교환이 성공적으로 되었습니다!
    }
}