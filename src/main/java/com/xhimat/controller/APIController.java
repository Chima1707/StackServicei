package com.xhimat.controller;

import com.xhimat.service.StackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by chima on 1/13/17.
 */
@RestController
@RequestMapping(path = "/api")
public class APIController {

    @Autowired
    private StackService service;

    @GetMapping("/")
    public List<Integer> showNumbers () {
        return service.show();
    }

    @PostMapping("/push")
    public void pushNumber (@RequestBody Integer number) {
        service.push(number);
    }

    @PostMapping("/pop")
    public void popNumber () {
        service.pop();
    }

}
