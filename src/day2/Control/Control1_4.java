package day2.Control;

class Control1_4 {
    public static void main(String[] args) {
        int score = 87;

        if (score >= 90) {
            if(score >= 95){
                System.out.println("A++등급입니다.");
            }else {
                System.out.println("A등급입니다.");
            }
        } else if(score >= 80) {
            if(score >= 85){
                System.out.println("B++등급입니다.");
            }else {
                System.out.println("B등급입니다.");
            }
        } else if(score >= 70) {
            if(score >= 75){
                System.out.println("C++등급입니다.");
            }else {
                System.out.println("C등급입니다.");
            }
        }else {
            System.out.println("D등급입니다.");
        }
    }
}
/*
if (조건식1) {
    조건식1의 결과가 참일 때 실행하고자 하는 문장;

if (조건식2) {
    조건식1 과 조건식 2의 결과가 모두 참일 때 실행하고자 하는 문장;
}
else {
    조건식1의 결과가 참이고, 조건식2의 결과가 거짓일 때 실행하고자 하는 문장;
}
}
else {
    조건식1의 결과가 거짓일 때 실행하고자 하는 문장;
}
 */