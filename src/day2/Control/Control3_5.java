package day2.Control;

class Control3_5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}

/*
향상된 for
for(타입 변수이름: 배열 or 컬렉션){
    배열 or 컬렉션의 길이만큼 반복적으로 실행하고자 하는 문장;
}
 */