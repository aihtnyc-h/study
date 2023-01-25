/*
캡슐화
접근 제어자를 사용하는 이유?
외부로부터 데이터를 보호하기 위해서 사용합니다.
내부적으로만 사용되는 것을 외부로 노출시키지 않고 감추기 위해서 사용됩니다.
이렇게 데이터를 보호하는 것을 캡슐화라고 부릅니다.
 */

package day4.capsule;

public class CapsuleEx1 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        // private 메서드 checkName 사용
        this.name = checkName(name) ? name : "anonymous";
    }

    // 이름을 입력할 때 공백 인지 확인 하는 메서드
    // Capsule 클래스 내부에서만 사용할 것이기 때문에 private
    private boolean checkName(String name) {
        return name.length() > 0;
    }
}

class CapsuleMain {
    public static void main(String[] args) {
        CapsuleEx1 capsule = new CapsuleEx1();
        // capsule.age; // private 제어자 이기 때문에 접근 불가능
        // capsule.name; // private 제어자 이기 때문에 접근 불가능

        // 따라서 직접 접근이 아니라 private 이 아닌 메서드를 통해서 접근한다.
        capsule.setAge(28);
        capsule.setName("bin");

        System.out.println("capsule.getName() = " + capsule.getName());
        System.out.println("capsule.getAge() = " + capsule.getAge());

        capsule.setName("");
        System.out.println("capsule.getName() = " + capsule.getName());
    }
}
/*
capsule.getName() = bin
capsule.getAge() = 28
capsule.getName() = anonymous
 */
