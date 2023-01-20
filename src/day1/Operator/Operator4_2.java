package day1.Operator;

class Operator4_2 {
    public static void main(String[] args) {
        char ch = '2';

        // 문자 '2' 는 숫자로 50, '0' 은 48
        // 따라서 int 타입으로 자동으로 변하기 때문에 50 - 48 = 2
        System.out.print("ch - '0' = ");
        System.out.println(ch - '0');

        int a = 1_000_000; // 1백만
        int b = 2_000_000; // 2백만

        // a * b = 2_000_000_000_000 -> 10^12
        // long 에 저장하려는 것은 맞지만 a * b 의 결과 타입이 int
        // 따라서 이미 계산을 할 때 오버플로우 발생! -> 따라서 계산을 할 때 형변환 필요!
        // long l = a * b; // -1454759936

        long l = (long)a * b;
        // long * int -> long * long => 1_000_000L * 2_000_000 -> 1_000_000L * 2_000_000L
        System.out.println("l = " + l);
    }
}
