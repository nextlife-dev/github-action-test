package singleton.parc;

public class BuyPlayer1 {

    public static void main(String[] args) {
        POS pos = POS.getInstance();

        pos.plus(500);
        pos.plus(200);
        pos.plus(450);

        System.out.println(pos.getSum());
    }
}
