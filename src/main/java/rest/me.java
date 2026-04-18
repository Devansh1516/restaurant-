package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
scanBasePackages = {
        "controler.copy",
        "server",
        "dao",
        "hiber"
    },exclude = {DataSourceAutoConfiguration.class})  // 🔥 THIS LINE IS IMPORTANT
public class me {

    public static void main(String[] args) {
        SpringApplication.run(me.class, args);
    }
}