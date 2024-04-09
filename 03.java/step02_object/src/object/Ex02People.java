package object;

class People2 {

    // 인스턴스 변수(필드)
    String name;
    int age;

    // 생성자 - 객체 생성 필수 요소, 객체 초기화
    public People2() {

    }

    // 사용자 정의 생성자
    // 생성자 오버로딩 Overloading
    People2(String name) {
        this.name = name;
    }


    People2(String name, int age) {
        this.name = name;

        // 3-1) 방법 1
        if (age >= 0) {
            this.age = age;
        }
    }

    // 메서드

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // 3-2) 방법 2
    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("음수 값은 나이로 지정 불가능");
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    void printInfo() {
        System.out.println(name + " " + age);
    }
}

class People3 {

}


class A {
    A() {
        System.out.println("Class A");
    }
}

class B {
    A a = new A();
    B() {
        System.out.println("Class B");
    }
}

public class Ex02People {

    public static void main(String[] args) {
        People2 sw = new People2("sw", 25);
        People2 hj = new People2("hj", 26);

        System.out.println(sw.getName());
        System.out.println(hj.getName());

        // 1) sw, hj 같은 타입인가? YES(같은 클래스 사용)
        // 2) sw, hj 같은 객체인가? NO(다른 주소 값 사용)
        // 3) 객체 보호
        // 나이 값 >= 0
        People2 cm = new People2("cm", -27);
        System.out.println(cm.getAge());

        // 3-2) 메서드
        cm.setAge(-27);

        // 3-3) private

        // 4) 기본 생성자 vs 사용자정의 생성자
        People2 java = new People2();

        // People3 타입 -> 객체 생성 가능? (생성자와 메서드 등 없는 빈 클래스) Yes
        People3 ppl3 = new People3();
        System.out.println(ppl3);
        // 기본 생성자의 경우 클래스 내부에서 생략되어도 만든다.
        // 프로그램이 자동으로 생성한다. (단, 사용자 정의 생성자가 없을 때만!)

        // Class A, B print
        A a = new A();
        B b = new B();
    }
}