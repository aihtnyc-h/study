package day1.Variable;

class Variable1_3 {
    public static void main(String[] args) {
        int year, age = 23;

        year = age + 2000;
        System.out.println("year = " + year); // 2023

        // 변수의 값을 읽어오는 과정
        // year = age + 2000;
        // year = 23 + 2000;
        // year = 2023;

        age = age + 1;
        System.out.println("age = " + age); // 24
        System.out.println("year = " + year); // 2023

        // 변수의 값을 읽어오는 과정
        // age = age + 1;
        // age = 23 + 1;
        // age = 24;
        // 프로그램은 순차적으로 코드가 실행되기 때문에
        // 여기서 age의 값이 바뀌었다고 year에 영향을 주지 않는다.
    }
}