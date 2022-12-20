package com.example.vehicule1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import  org.springframework.web.servlet.config.annotation.CorsRegistry;
import lombok.*;

@SpringBootApplication

public class Vehicule1Application {

    public static void main(String[] args) {
        SpringApplication.run(Vehicule1Application.class, args);
    }

    @Bean
    WebMvcConfigurer corsConfig(){
        return new WebMvcConfigurer() {
            @Override
            public  void addCorsMappings(@NonNull CorsRegistry registry){
                registry.addMapping("/*").allowedOriginPatterns("http://localhost:[:]");
            }
        };
    }

}
