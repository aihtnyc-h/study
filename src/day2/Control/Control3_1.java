package day2.Control;

class Control3_1 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("for 문이 " + (i + 1) + "번째 반복 실행중입니다.");
        }
        System.out.println("for 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
    }
}

/*
for(초기화; 조건식; 증감식){
    조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 문자;
}

실행순서
1. 초기화
2. 조건식
3. 조건식이 참일 경우 문장수행
4. 증감식
5. 조건식이 거짓이 될 때까지 반복
 */
