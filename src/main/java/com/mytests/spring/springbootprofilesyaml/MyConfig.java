package com.mytests.spring.springbootprofilesyaml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mytests.spring.springbootprofilesyaml.beans.Bean1;
import org.springframework.context.annotation.Profile;

/**
 * *
 * <p>Created by irina on 1/30/2024.</p>
 * <p>Project: springboot-profiles-yaml</p>
 * *
 */
@Configuration
public class MyConfig {
    @Bean(name = "bean1") @Profile("prof1")
    public Bean1 b11() {
        return new Bean1("bean1 prof1");
    }

    @Bean(name = "bean1") @Profile("prof2")
    public Bean1 b12() {
        return new Bean1("bean1 prof2");
    }
    @Bean(name = "bean1") @Profile("prof3")
    public Bean1 b13() {
        return new Bean1("bean1 prof3");
    }
    @Bean(name = "bean1") @Profile("prof4")
    public Bean1 b14() {
        return new Bean1("bean1 prof4");
    }


}
