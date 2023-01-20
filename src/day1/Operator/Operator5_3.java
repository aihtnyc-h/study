package day1.Operator;

class Operator5_3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

        System.out.print("x를 y로 나눈 몫 = ");
        System.out.println(x / y);

        System.out.print("x를 y로 나눈 나머지 = ");
        System.out.println(x % y);

        // 부호 무시 확인
        int n = 3;
        int z = -3;
        System.out.println("x % n = " + x % n);
        System.out.println("x % z = " + x % z);
    }
}
