package day1.Operator;

class Operator6_1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 6;
        char c1 = 'A', c2 = 'B';

        System.out.print("n1 >= n2 = " ); // true
        System.out.println(n1 >= n2);
        System.out.print("n1 <= n2 = " ); // false
        System.out.println(n1 <= n2);

        System.out.print("n1 == n2 = " ); // false
        System.out.println(n1 == n2);
        System.out.print("n1 != n2 = " ); // true
        System.out.println(n1 != n2);

        // 산술변환 규칙에 의해서 char 타입이 int 타입으로 변환되어 연산됨
        System.out.print("c1 < c2 = "); // true
        System.out.println(c1 < c2); // 65 < 66
        System.out.print("c1 > c2 = "); // false
        System.out.println(c1 > c2); // 65 > 66
    }
}
