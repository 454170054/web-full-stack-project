package com.jf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-11-06 19:00
 */
@Configuration
@ComponentScan("com.jf")
@EnableAspectJAutoProxy
public class AppConfig {
}
