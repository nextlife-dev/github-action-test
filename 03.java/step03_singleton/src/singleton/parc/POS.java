package singleton.parc;

public class POS {

    private static POS instance = new POS();

    public POS() {
    }

    public static POS getInstance() {
        if (instance == null) {
            instance = new POS();
        }
        return instance;
    }

    // Features

    private int sum = 0;

    public void plus(int price) {
        sum += price;
    }

    public int getSum() {
        return sum;
    }
}
