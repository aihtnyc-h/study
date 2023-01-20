package day2.Control;

class Control1_2 {
    public static void main(String[] args) {
        char ch = 'Z';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else {
            System.out.println("해당 문자는 영문 소문자가 아닙니다.");
        }
    }
}

/*
if(조건식) {
    조건식의 결과가 참일 때 실행하고자 하는 문장;
}
else {
    조건식의 결과가 거짓일 때 실행하고자 하는 문장;
}
 */