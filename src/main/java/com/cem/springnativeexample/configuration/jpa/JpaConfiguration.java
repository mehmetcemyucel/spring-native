package com.cem.springnativeexample.configuration.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.cem.springnativeexample.repository")
@EntityScan("com.cem.springnativeexample.repository.entity")
public class JpaConfiguration {
}
