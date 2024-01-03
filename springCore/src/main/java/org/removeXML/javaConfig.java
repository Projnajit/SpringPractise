package org.removeXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {

    public Name getName() {
        return new Name();
    }
    @Bean
    public Helper getHelper() {
        return new Helper(getName());
    }
}
