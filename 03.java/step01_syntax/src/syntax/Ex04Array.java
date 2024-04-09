package syntax;

import java.util.Arrays;

public class Ex04Array {

    public static void main(String[] args) {
        // Array : 배열의 초기크기 지정!
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[3];
        int[] arr3;
        // arr3 = {4, 5, 6}; 생성과 동사ㅣ에 초기화 필수!!
        arr3 = new int[]{4, 5, 6};

        // arr1 요소의 개수 값 = 배열 길이
        System.out.println(arr1.length);

        // 출력
        System.out.println(arr3[1]);

        // 출력 전체
        System.out.println(arr3); // 객체 주소 값 출력

        // 출력 loop문
        // v1
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        // v2
        for (int v : arr3) {
            System.out.println(v);
        }

        // v3 : Arrays.toString()
        System.out.println(Arrays.toString(arr3));

        // 다중 배열
        int[][] numbers = {
                {5, 10},
                {4, 8},
                {3, 6},
                {2, 4},
                {1, 2},
        };

        // v1
        for (int[] parent : numbers) {
            for (int child : parent) {
                System.out.print(child + " ");
            }
            System.out.println();
        }

        // v2
        for (int[] parent : numbers) {
            System.out.println(Arrays.toString(parent));
        }

        // 문자열 배열
        String[] alphabet = {"a", "b", "c", "d", "e"};
        for (String alpha : alphabet) {
            System.out.println(alpha);
        }

        // 얇은 복사
        int[] arr11 = {1, 2, 3};
        int[] arr12 = arr11;

        System.out.println(arr11); // [I@7699a589
        System.out.println(arr12); // [I@7699a589

        // 깊은 복사
        // 1) for
        int[] arr13 = new int[arr11.length];
        for (int i = 0; i < arr13.length; i++) {
            arr13[i] = arr11[i];
        }

        // 2) clone()
        int[] arr14 = arr11.clone();
        System.out.println(arr14);
        arr14[1] = 20;

        System.out.println(Arrays.toString(arr11));
        System.out.println(Arrays.toString(arr14));

        // 3) Arrays.copyOf(원본배열, 복사할 요소 개수)
        int[] arr15 = Arrays.copyOf(arr11, arr11.length);
        System.out.println(arr15);


    }
}
