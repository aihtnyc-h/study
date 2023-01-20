package day2.Control;

class Control5_3 {
    public static void main(String[] args) {
        int j = 1;

        do {
            System.out.println("do / while 문이 " + j + "번째 반복 실행중입니다.");
            j++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
        } while (j < 20);

        System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
    }
}

/*
do - while
do{
    조건식의 결과가 참인 동나 반복적으로 실행하고자 하는 문장;
}while(조건식);

실행순서
처음 한 번은 무조건 실행
조건식
조건식이 참일 경우 문장 수행
조건식이 거짓이 될 때 까지 반복
 */