package com.mytests.spring.springbootprofilesyaml;

import com.mytests.spring.springbootprofilesyaml.beans.Bean1;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 1/30/2024.</p>
 * <p>Project: springboot-profiles-yaml</p>
 * *
 */
@RestController
@RequestMapping("/${my.top.mapping}")
public class MyController {


    private final Bean1 bean1;

    public MyController(Bean1 bean1) {
        this.bean1 = bean1;
    }

    @GetMapping("/test1")
    public String test1() {
        return "test1 "+bean1.getId();
    }


}
