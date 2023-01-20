package day2.Arrays;


// 총합과 평균을 구하기
class Arrays3_2 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장
        float avg = 0f; // 평균을 저장

        int[] score = {100, 40, 33, 50, 77, 29};

        for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "] = " + score[i]);
            sum += score[i];
        }

        avg = sum / (float) (score.length); // 계산결과를 float 타입으로 얻기 위해 형변환

        System.out.println("총합 = " + sum);
        System.out.println("평균 = " + avg);
    }
}
