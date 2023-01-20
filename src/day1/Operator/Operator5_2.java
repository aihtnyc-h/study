package day1.Operator;

class Operator5_2 {
    public static void main(String[] args) {
        double num = 3.14;

        System.out.println("반올림 : " + Math.round(num)); // 반올림 : 3
        System.out.println("올림 : " + Math.ceil(num)); // 올림 : 4.0
        System.out.println("내림 : " + Math.floor(num)); // 내림 : 3.0
        System.out.println("절대값 : " + Math.abs(num*-1)); // 절대값 : 3.14
    }
}