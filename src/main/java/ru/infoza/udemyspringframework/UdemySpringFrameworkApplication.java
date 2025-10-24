package ru.infoza.udemyspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.infoza.udemyspringframework.enterprise.web.MyWebController;
import ru.infoza.udemyspringframework.game.GameRunner;

@SpringBootApplication
public class UdemySpringFrameworkApplication {

    public static void main(String[] args) {
        //        MarioGame game = new MarioGame();
        //        SuperContraGame game = new SuperContraGame();
        //        PacmanGame game = new PacmanGame();
        //        GameRunner runner = new GameRunner(game);
        //        runner.run();

        ConfigurableApplicationContext context
                = SpringApplication.run(UdemySpringFrameworkApplication.class, args);
        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();

        MyWebController controller = context.getBean(MyWebController.class);
        System.out.println(controller.returnValueFromBusinessService());

    }

}
