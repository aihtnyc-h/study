package day1.Operator;

class Operator6_2 {
    public static void main(String[] args) {
        String s1 = "사랑";
        String s2 = "사랑";

        System.out.print("s1 == s2 = "); // true
        System.out.println(s1 == s2);
        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // true

        // 하지만!
        String s3 = new String("사랑");
        System.out.print("s1 == s3 = "); // false
        System.out.println(s1 == s3);
        System.out.println("s1.equals(s3) = " + s1.equals(s3)); // true
    }
}
