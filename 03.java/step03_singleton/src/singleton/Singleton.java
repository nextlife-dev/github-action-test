package singleton;

public class Singleton {

    // private static variable
    private static Singleton instance = new Singleton();

    // private constructor
    private Singleton() {}

    // public getInstance method
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
