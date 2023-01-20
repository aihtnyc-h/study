package day2.Control;

class Control3_4 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단 시작합니다.");
            for (int j = 1; j < 10; j++) {
                System.out.println("j는 현재 " + (j) + "입니다.");
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}
/*
for (초기화; 조건식1; 증감식) {
    조건식1의 결과가 참인 동안 반복적으로 실행하고자 하는 문장;

for (초기화; 조건식2; 증감식) {
    조건식2의 결과가 참인 동안 반복적으로 실행하고자 하는 문장;
    }

}
 */