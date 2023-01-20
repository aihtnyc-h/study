package day2.Arrays;

// 최대값과 최소값을 찾기
class Arrays3_3 {
    public static void main(String[] args) {
        int[] score = {65, 97, 88, 43, 33, 91, 28};

        int max = score[0]; // 최대값을 배열의 첫 번째 값으로 초기화 한다.
        int min = score[0]; // 최소값을 배열의 첫 번째 값으로 초기화 한다.

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값 = " + max);
        System.out.println("최소값 = " + min);
    }
}