package object;

import java.util.ArrayList;
import java.util.List;

class Player {

    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Block {

    private final String name;
    private final Player owner;

    public Block(String name, Player owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Player getOwner() {
        return owner;
    }
}

class Dirt extends Block {

    public Dirt(Player owner) {
        super("dirt", owner);
    }
}

class Sand extends Block {

    public Sand(Player owner) {
        super("sand", owner);
    }
}

class Minecraft {

    private final List<Block> blocks = new ArrayList<>();
    private final List<Player> players = new ArrayList<>();

    public void join(Player player) {
        this.players.add(player);
    }

    public void left(Player player) {
        this.players.remove(player);
    }

    public void put(Block block) {
        this.blocks.add(block);
    }

    public void dig(Block block) {
        this.blocks.remove(block);
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public List<Player> getPlayers() {
        return players;
    }
}

public class Ex05Practice {

    public static void main(String[] args) {
        // 클래스 설계 -> 객체 생성 -> 기능 확인
        Minecraft minecraft = new Minecraft();

        Player player1 = new Player("스티브");
        Player player2 = new Player("애기");
        Player player3 = new Player("청년");

        minecraft.join(player1); // 1 입장
        minecraft.join(player3); // 3 입장

        minecraft.left(player1); // 1 퇴장

        Block dirt1 = new Dirt(player1);
        minecraft.put(dirt1); // 1 흙 설치
        Block sand1 = new Sand(player1);
        minecraft.put(sand1); // 1 모래 설치

        for (Player p : minecraft.getPlayers()) {
            System.out.println(p.getName() + " 입장 됨");
        }

        for (Block b : minecraft.getBlocks()) {
            System.out.println(b.getOwner().getName() + "가 설치한 것: " + b.getName());
        }

        System.out.println("------------------- 1시간 후");

        minecraft.join(player2); // 2 입장
        minecraft.join(player1); // 1 입장

        Block dirt2 = new Dirt(player2);
        Block dirt3 = new Dirt(player1);
        Block dirt4 = new Dirt(player3);

        minecraft.put(dirt2);
        minecraft.put(dirt3);
        minecraft.put(dirt4);

        minecraft.dig(dirt1);

        for (Player p : minecraft.getPlayers()) {
            System.out.println(p.getName() + " 입장 됨");
        }

        for (Block b : minecraft.getBlocks()) {
            System.out.println(b.getOwner().getName() + "가 설치한 것: " + b.getName());
        }
    }

}
