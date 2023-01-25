/*
관계 결정
상속관계 : ~은 ~ 이다 (is - a)
포함관계 : ~은 ~을 가지고 있다. (has - a)
 */

package day4.inheritance.one_Point;

public class four {
    class Point {int x,y;}

    class Circle { // 원은 점을 가지고 있다.
        Point point = new Point();
        int r;
    }

    class Circles extends Point { // 원은 점이다.
        int r;
    }
}
