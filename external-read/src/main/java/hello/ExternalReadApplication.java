package hello;

import hello.config.MyDataSourceConfigV3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(MyDataSourceConfigV3.class)
@SpringBootApplication(scanBasePackages = "hello.datasource")
public class ExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalReadApplication.class, args);
    }

}