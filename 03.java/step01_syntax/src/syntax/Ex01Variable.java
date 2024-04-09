package syntax;

public class Ex01Variable {

    public static void main(String[] args) {
        // 기본타입 Primitive Type

        // 정수
        byte vb1 = -128;
        byte vb2 = 127;

        short vs1 = 128;

        int vi1 = 10;
        int vi2 = 0B1010; // 이진수 표현

        long vl1 = 1000000000; // 100억 출력안됨. (0 9개)
        // 기본 데이터 타입을 int으로 정해져 있기 때문이다. Long 타입으로 바꾸려면 명시적 표현이 필요하다.
        long vl2 = 10000000000L; // (0 10개)

        // 실수
        float vf1 = 3.14f;
        double vd1 = 3.14;

        // 문자
        char vc1 = 'A';
        char vc2 = 65;

        // 논리
        boolean vt1 = true;
        boolean vt2 = false;

        // 참조 타입, 객체 타입 Reference Type
        // 문자열 ""
        String vf = "안녕";
        System.out.println(vf);
    }
}
