/*
포함관계
믈래스의 멤버로 참조 변수를 선안하는 것!
작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다!
 */
package day4.inheritance.one_Point;

public class three {

    class Engine {}
    class Door {}
    class Car {
        Engine engine = new Engine(); //엔진
        Door[] doors = new Door[4]; //자동차 문 4개, Door 클래스 하나로 문 4개 생성 // 문의 개수를 넷으로 가정하고 배열로 처리!
    }
}
