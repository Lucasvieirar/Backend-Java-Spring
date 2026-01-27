package com.eventostec.api.config;

import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {
    @Value("${aws.region}")
    private String awsRegion;


    @Bean
    public AmazonS3 createS3Instance(){
        return AmazonS3ClientBuild
                .standar()
                .withRegion(awsRegion)
                .build();
    }
}
