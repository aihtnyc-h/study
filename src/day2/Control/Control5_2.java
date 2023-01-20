package day2.Control;

class Control5_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum <= 100) {
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            sum += ++i;
        }
    }
}