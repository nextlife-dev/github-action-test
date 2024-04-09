package syntax;

public class Ex03ControlFlow {

    public static void main(String[] args) {
        // 1) if
        // 관리자 id "admin"일 때 접속 성공 / 실패

        final String id = "admin";

        if (id == "admin") {
            System.out.println("접속 성공");
        } else if (id == "admin2") {
            System.out.println("접속 성공");
        } else {
            System.out.println("접속 실패");
        }

        // 2) switch / case: byte, short, int, Long, float, double, enum
        int num = 3;

        switch (num) {
            case 1:
                System.out.println("상담");
                break;
            case 2:
                System.out.println("연결");
                break;
            case 3:
                System.out.println("다시듣기");
                break;
            default:
                System.out.println("오류");
                break;
        }

        // 3) loop
        // 1. for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // 2. while
        int start = 0;
        int end = 10;
        while (true) {
            if (start % 2 == 1) {
                System.out.println(start);
            }
            if (start >= end) {
                break;
            }
            start++;
        }
    }

}