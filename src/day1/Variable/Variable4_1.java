package day1.Variable;

class Variable4_1 {
    public static void main(String[] args) {
        char ch1 = 'A'; // 문자
        // char ch2 = 'AB'; // Error 발생
        // char ch3 = ''; // Error 발생, 빈 문자 불가능

        String s1 = "ABC"; // 문자열
        String s2 = ""; // 빈 문자열 가능
        String s3 = "A"; // 문자 한 개도 문자열!

        // 아래 두 표현식 모두 사용 가능하지만 ss2 방식은 거의 사용하지 않음!
        String ss1 = "AB";
        String ss2 = new String("AB");

        System.out.println("ss1 = " + ss1);
        System.out.println("ss2 = " + ss2);
    }
}