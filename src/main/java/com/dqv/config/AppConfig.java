package com.dqv.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by ezequ on 11/10/2016.
 */
@Configuration
@ComponentScan(basePackages = {"com.dqv.*"})
@Import(value = {HibernateConfig.class,WebMvcConfig.class})
public class AppConfig {
}
