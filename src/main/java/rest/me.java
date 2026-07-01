package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {
        "controler.copy",
        "server",
        "dao",
        "hiber"
    }
)
public class me {

    public static void main(String[] args) {
        SpringApplication.run(me.class, args);
    }
}