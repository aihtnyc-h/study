package day2.Control;

class Control6_4 {
    public static void main(String[] args) {
        int i = 2;
        allLoop :
        while (true) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            i++;
        }
    }
}