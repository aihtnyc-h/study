package day2.Control;

class Control6_3 {
    public static void main(String[] args) {
        allLoop :
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}

/*
이름붙는 반복문
반복문에 이름을 붙여서 하나 이상의 반복문을 벗어나기
i == 5를 통해 5에서 멈춤 4단까찌 나옴

 */