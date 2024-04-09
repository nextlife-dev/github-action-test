package object;

class Employee {
    // 인스턴스 변수
    String name;
    // static 변수
    static String company = "it";
//	static {
//		company = "it";
//		Employee emp = new Employee("dev");
//		emp.name = "dev";
//	}


    // 상수 : static final 타입 CONSTANT_VALUE
    static final double PI = 3.14;

    Employee(String name) {
        this.name = name;
    }

    // getName
    String getName() {
        return name;
    }

    // getCompany
    static String getCompany() {
        return company;
    }

}

public class Ex03Static {

    public static void main(String[] args) {
        Employee emp1 = new Employee("emp1");
        System.out.println(emp1.name);
//		System.out.println(Employee.company);

//		Employee.PI = 3.15;
//		System.out.println(Employee.PI);
        System.out.println(Employee.getCompany());
    }

}