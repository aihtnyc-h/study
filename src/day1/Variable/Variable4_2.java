package day1.Variable;

class Variable4_2 {
    public static void main(String[] args) {
        String s1 = "A" + "B"; // "AB"
        System.out.println("s1 = " + s1);

        // 문자열은 문자열하고만 결합할 수 있기 때문에
        // 숫자를 문자열로 바꾼 다음에 결합 합니다.
        String s2 = "" + 7;
        // "" + 7 => "" + "7" = "7"
        System.out.println("s2 = " + s2);

        // 문자열 결합 순서에 의한 차이 확인!
        String s3 = "" + 7 + 7;
        // "" + 7 + 7 => "7" + 7 => "7" + "7" = "77"
        System.out.println("s3 = " + s3);

        String s4 = 7 + 7 + "";
        // 7 + 7 + "" => 14 + "" = "14"
        System.out.println("s4 = " + s4);
    }
}