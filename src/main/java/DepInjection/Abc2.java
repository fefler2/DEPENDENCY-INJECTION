package DepInjection;

import Usunac2.Abc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Abc2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Abc2.class, args);

//        Alien a = new Alien();
        //         Alien.class to typ jaki musi wziac Bean
        Alien a = context.getBean(Alien.class);
        a.show();

        Alien a1 = context.getBean(Alien.class);
        a1.show();


    }
}
