package tanchak.kafka.producer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MainReceiver implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MainReceiver.class, args);
    }

    @Override
    public void run(String... args) {
        log.trace("Main started");
        log.trace("log.trace");
        log.debug("log.debug");
        log.info("log.info");
        log.warn("log.warn");
        log.error("log.error");
    }
}
