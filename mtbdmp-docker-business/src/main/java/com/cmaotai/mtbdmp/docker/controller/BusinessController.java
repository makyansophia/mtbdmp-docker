package com.cmaotai.mtbdmp.docker.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BusinessController {

    @RequestMapping("/business/{info}")
    public String test(@PathVariable(value="info") String info) throws Exception {
        return info;
    }
}
