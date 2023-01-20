package day2.Control;

class Control5_1 {
    public static void main(String[] args) {
        int i = 10; // while 반복 횟수 , 즉 for 문의 초기화

//        while (i-- != 0) {
//            System.out.println(i);
//        }

        // 위 코드와 같은 동작을 수행합니다.
        while (i != 0) {
            i--;
            System.out.println(i);
        }
    }
}

/*
while (조건식){
    조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 문장;
}

실행순서
조건식
조건식이 참일경우 문장 수행
조건식이 거짓이 될 때 까지 반복
 */