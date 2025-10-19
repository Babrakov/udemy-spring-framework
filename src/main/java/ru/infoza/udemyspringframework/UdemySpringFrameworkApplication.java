package ru.infoza.udemyspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.infoza.udemyspringframework.game.GameRunner;
import ru.infoza.udemyspringframework.game.MarioGame;
import ru.infoza.udemyspringframework.game.PacmanGame;
import ru.infoza.udemyspringframework.game.SuperContraGame;

@SpringBootApplication
public class UdemySpringFrameworkApplication {

	public static void main(String[] args) {
//        SpringApplication.run(UdemySpringFrameworkApplication.class, args);

//        MarioGame game = new MarioGame();
//        SuperContraGame game = new SuperContraGame();
        PacmanGame game = new PacmanGame();
        GameRunner runner = new GameRunner(game);
        runner.run();

	}

}
