package day2.Control;

class Control4_1 {
    public static void main(String[] args) {
        // 괄호 { } 안의 내용을 20번 반복
        // 1. 1 ~ 10 사이의 난수를 20개 출력하시오.
        // 1,2,3,4,5,6,7,8,9,10

        // 2. -5 ~ 5 사이의 난수를 20개 출력하시오.
        // -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
        for (int i = 0; i < 20; i++) {
            // 1번
//            System.out.println(Math.random() * 10); // 1. 0.0 * 10 <= x * 10 < 1.0 * 10
//            System.out.println((int)(Math.random() * 10)); // 2. 0 <= (int)(x * 10) < 10
//            System.out.println((int)(Math.random() * 10) + 1); // 3. 1 <= (int)(x * 10) + 1 < 11

            // 2번
//            System.out.println((int)(Math.random() * 11)); // 0 ~ 10
            System.out.println((int)(Math.random() * 11) - 5); // -5 ~ 5
        }
    }
}

/*
1부터 5사이의 random 한 정수 값 구하기
0.0 * 5 <= Math.random() * 5 < 1.0 * 5
(int)0.0 <= (int)(Math.random() * 5) < (int)5.0
0 + 1 <= (int)(Math.random() * 5) + 1 < 5 + 1
1 <= (int)(Math.random() * 5) + 1 < 6
 */