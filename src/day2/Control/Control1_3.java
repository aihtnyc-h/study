package day2.Control;

class Control1_3 {
    public static void main(String[] args) {
        char ch = 'p';

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("해당 문자는 영문 대문자입니다.");
        } else {
            System.out.println("해당 문자는 영문자가 아닙니다.");
        }

        int score = 70;

        if (score >= 90) {
            System.out.println("A등급입니다.");
        } else if(score >= 80) {
            System.out.println("B등급입니다.");
        } else if(score >= 70) {
            System.out.println("C등급입니다.");
        }
    }
}

/*
if (조건식1) {
    조건식1의 결과가 참일 때 실행하고자 하는 문장;**
}
else if (조건식2) {
    조건식2의 결과가 참일 때 실행하고자 하는 문장;**
}
else {
    조건식1의 결과도 거짓이고, 조건식2의 결과도 거짓일 때 실행하고자 하는 문장;
    즉, 위의 어느 조건식에도 만족하지 않을 때 수행**
}

 */