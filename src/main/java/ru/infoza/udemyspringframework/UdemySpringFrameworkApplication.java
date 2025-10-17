package ru.infoza.udemyspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.infoza.udemyspringframework.game.GameRunner;
import ru.infoza.udemyspringframework.game.MarioGame;

@SpringBootApplication
public class UdemySpringFrameworkApplication {

	public static void main(String[] args) {
//        SpringApplication.run(UdemySpringFrameworkApplication.class, args);

        MarioGame game = new MarioGame();
        GameRunner runner = new GameRunner(game);
        runner.run();

	}

}
