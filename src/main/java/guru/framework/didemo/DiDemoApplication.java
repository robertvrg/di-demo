package guru.framework.didemo;

import guru.framework.didemo.controllers.MyController;
import guru.framework.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    }
}
