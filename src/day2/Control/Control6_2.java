package day2.Control;

class Control6_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            // 3의 배수는 건너뜀 : 3, 6, 9
            if (i % 3 == 0)
                continue;
            System.out.println("i = " + i);
        }
    }
}

/*
continue
자신이 포함된 반복문의 끝으로 이동
그리고 다음 반복으로 넘어감
전체 반복 중에서 특정 조건시 반복을 건너뛸 때 유용
 */