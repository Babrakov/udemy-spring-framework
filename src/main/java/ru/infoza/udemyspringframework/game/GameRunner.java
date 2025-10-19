package ru.infoza.udemyspringframework.game;

public class GameRunner {

    private final GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.left();
        game.down();
        game.right();
    }
}
