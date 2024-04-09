package object;

/*
 * People
 *   속성: name, age
 *   기능: getXXX, printInfo
 *
 * */

class People {

    // 인스턴스 변수(필드)
    String name;
    int age;

    // 생성자 - 객체 생성 필수 요소, 객체 초기화
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    void printInfo() {
        System.out.println(name + " " + age);
    }
}

public class Ex01People {

    public static void main(String[] args) {
        // 객체 생성

        // <클래스 이름> <변수 명> = new <클래스 이름>()
        People ppl1 = new People("함승우", 23);

        System.out.println(ppl1);
        ppl1.printInfo();
    }

}
