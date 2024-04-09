package object;

/*
* 접근 제어자 Access Modifier
* private < default < protected < public
* */

public class Ex04Access {

    public static void main(String[] args) {
        People java = new People("java", 28);
        System.out.println(java.getAge());
    }
}
