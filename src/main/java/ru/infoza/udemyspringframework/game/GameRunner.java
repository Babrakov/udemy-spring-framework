package ru.infoza.udemyspringframework.game;

public class GameRunner {

    private final MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.left();
        game.down();
        game.right();
    }
}
