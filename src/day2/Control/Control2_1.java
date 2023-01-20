package day2.Control;

class Control2_1 {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            case 0: case 13:
                System.out.println("이런식으로 case 문을 사용할 수 있습니다.");
                break;
            case 15:
            default: monthString = "Invalid month";
        }
        System.out.println(monthString);
    }
}

/*
int num, result;
final int ONE = 1;
switch (result) {
case '1':             // OK. 문자 리터럴(정수 49와 동일)
case ONE:         // OK. 정수 상수
case "YES"        // OK. 문자열 리터럴
case num:         // Error. 변수는 불가능
case 1.0:            // Error. 실수도 불가능
}
 */