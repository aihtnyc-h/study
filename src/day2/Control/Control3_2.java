package day2.Control;

class Control3_2 {
    public static void main(String[] args) {
        // 1번
        for (int i = 1; i <= 10; i = i * 2) {
            System.out.println("1번 i는 현재 " + (i) + "입니다.");
        }
        System.out.println();
        // 2번
        for (int i = 10; i >= 1; i--) {
            System.out.println("2번 i는 현재 " + (i) + "입니다.");
        }
    }
}