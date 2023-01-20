package day2.Control;

class Control6_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            if(sum > 100)
                break;
            ++i;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}

/*
break
자신이 포함된 하나의 반복문을 벗어난다.
 */