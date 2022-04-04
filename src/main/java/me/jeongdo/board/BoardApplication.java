package me.jeongdo.board;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BoardApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BoardApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(BoardApplication.class);
        application.setLogStartupInfo(Boolean.FALSE);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

}
