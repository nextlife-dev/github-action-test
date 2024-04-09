package singleton;

public class LogTest2 {
    public static void main(String[] args) {

        // login시 성공 -> "로그인 성공" / 실패 -> "로그인 실패"

        String password = "admin";
        String inputPassword = "it";
        Log log = Log.getInstance();
//		Log log = new Log();
//		System.out.println(log);

        if(inputPassword == password) {
//			System.out.println("로그인 성공");
            log.logSuccess();
        }else {
//			System.out.println("로그인 실패");
            log.logFail();
        }

    }
}


