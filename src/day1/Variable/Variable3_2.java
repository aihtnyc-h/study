package day1.Variable;

class Variable3_2  {
    public static void main(String[] args) {
        int num = 5;
        char ch = '5';

        // 숫자 -> 문자
        System.out.println("num = " + num);
        // '0' 이 48이기 때문에 결과값을 char 타입으로 변환 필요
        System.out.println("num + '0' = " + (char)(num + '0'));

        // 문자 -> 숫자
        System.out.println("ch = " + ch);
        System.out.print("ch - '0' = ");
        System.out.println(ch - '0');

        // '5' 에서 숫자 5로 변환되었기 때문에 결과값 6
        System.out.print("ch - '0' + 1 = ");
        System.out.println(ch - '0' + 1);
    }
}