package rest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}
,scanBasePackages={"controler.copy","server","dao","hiber"})

public class me {
public static void main(String[] args) {
	SpringApplication.run(me.class, args);
}
}
