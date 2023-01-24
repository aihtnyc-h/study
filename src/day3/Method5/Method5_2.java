package day3.Method5;
//return
public class Method5_2 {
    void gugudan(int dan) {
        for (int i = 1; i <= 9; i++) {
            if (!(dan >= 2 && dan <= 9)) {
                System.out.println(dan + "단은 없습니다.");
                System.out.println();
                return;
            }
        }
        System.out.println(dan + "단 시작!");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + " = " + dan * i);
        }
        System.out.println();
    }

    boolean checkMax(int x, int y) {
        if (x > y) {
            return true;
        } else {
            return false;
            // return 반드시 필요합니다. 만약 없으면 조건문이 false 일 경우, void 가 아닌데 return 문이 없음으로 Error
        }
    }

}

class Method5_2Main {
    public static void main(String[] args) {
        Method5_2 method = new Method5_2();

        method.gugudan(2);
        method.gugudan(5);
        method.gugudan(10);
        method.gugudan(9);

        System.out.println("method.checkMax(10, 8) = " + method.checkMax(10, 8));
        System.out.println("method.checkMax(5, 9) = " + method.checkMax(5, 9));
    }
}
/*
2단 시작!
2*1 = 2
2*2 = 4
2*3 = 6
2*4 = 8
2*5 = 10
2*6 = 12
2*7 = 14
2*8 = 16
2*9 = 18

5단 시작!
5*1 = 5
5*2 = 10
5*3 = 15
5*4 = 20
5*5 = 25
5*6 = 30
5*7 = 35
5*8 = 40
5*9 = 45

10단은 없습니다.

9단 시작!
9*1 = 9
9*2 = 18
9*3 = 27
9*4 = 36
9*5 = 45
9*6 = 54
9*7 = 63
9*8 = 72
9*9 = 81

method.checkMax(10, 8) = true
method.checkMax(5, 9) = false
 */