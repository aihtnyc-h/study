package day2.Arrays;

import java.util.Arrays;

class Arrays5_1 {
    public static void main(String[] args) {
        int[][] score = {
                {88, 35, 100},
                {84, 60, 55},
                {100, 99, 72},
                {33, 54, 77}
        };

        //길이 확인하기
        System.out.println("score.length = " + score.length);
        System.out.println("score[0].length = " + score[0].length);

        System.out.println();
        // 출력 예 1 : Arrays.toString()
        System.out.println("Arrays.toString()");
        System.out.println("Arrays.toString(score[0]) = " + Arrays.toString(score[0]));
        System.out.println("Arrays.toString(score[1]) = " + Arrays.toString(score[1]));
        System.out.println("Arrays.toString(score[2]) = " + Arrays.toString(score[2]));
        System.out.println("Arrays.toString(score[3]) = " + Arrays.toString(score[3]));

        System.out.println();
        // 출력 예 2 : for
        System.out.println("for");
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
            }
            System.out.println();

        }

        System.out.println();
        // 출력 예 3 : 향상된 for
        System.out.println("향상된 for");
        for (int[] ints : score) {
            for (int it : ints) {
                System.out.println("anInt = " + it);
            }
            System.out.println();
        }
    }
}

/*
int[][] score = new int[][]{{}, {}, {}, {}};
int[][] score = {{}, {}, {}, {}};
 */