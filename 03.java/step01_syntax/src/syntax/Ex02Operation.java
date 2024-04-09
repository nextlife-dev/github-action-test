package syntax;

public class Ex02Operation {

    public static void main(String[] args) {
        // Operation

        int v1 = 10;
        int v2 = 3;

        System.out.println(v1 % v2);

        byte v3 = 10;
        byte v4 = 3;

        // Casting
        // 큰 데이터 타입에서 작은 데이터 타입으로 옮길 때 반드시 데이터 손실이 일어날 수 있다.
        // 쉽게 말해 그릇을 비유 생각해보면 된다
        byte v5 = (byte) (v3 + v4);

        // v3, v4 -> 3.333... 출력
        System.out.println((double) v3 / v4);

        int v6 = 10;
        float v7 = 3;
        System.out.println(v6 / v7);

        // 2. 비교
        System.out.println(v3 > v4);
        System.out.println(v3 == v4);
        System.out.println(v3 != v4);

        // 3. 논리
        // and / or / not
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue && isFalse);
        System.out.println(isTrue || isFalse);
        System.out.println(!isTrue);

        // 4. 대입
        // 참고) 삼항 연산
        // 조건) 조건? 참 : 거짓
        int i = -4;
        System.out.println(i > 0? i : i * -1);
        System.out.println(i > 0? i : -i);



    }
}
