package day1.Operator;

class Operator5_1 {
    public static void main(String[] args) {
        long result = Math.round(3.645678);
        System.out.println("result = " + result);

        // 소수점 4째 자리에서 반올림한 값을 구하라!
        double pi = 3.141592;
        // pi * 1000 = 3141.592
        // Math.round(3141.592) = 3142
        // 3142 / 1000.0 = 3.142
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi); // 3.142

        // 3.141 구하기!
        double pi2 = 3.141592;
        // pi2 * 1000 = 3141.592
        // (int)3141.592
        System.out.println("(int)(pi2 * 1000) = " + (int) (pi2 * 1000));
        System.out.println("(int)(pi2 * 1000) / 1000.0  = " + (int) (pi2 * 1000) / 1000.0);
    }
}
