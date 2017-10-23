package pl.sdacademy.vetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sdacademy.vetclinic.service.PetService;

@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        runApplication();
    }

    private static void runApplication() {
        SpringApplication.run(Main.class);
    }

    private static void generateData() {
        InputDataGenerator dataGenerator = new InputDataGenerator();
        dataGenerator.generateSampleData();
    }
}
