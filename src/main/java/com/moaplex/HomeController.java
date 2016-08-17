package com.moaplex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanna on 2016-08-17.
 */
@RestController
public class HomeController {

    @RequestMapping
    public String test() {
        return "Helloworld";
    }

    @RequestMapping("/joinmember")
    public void test2() {

    }
}
