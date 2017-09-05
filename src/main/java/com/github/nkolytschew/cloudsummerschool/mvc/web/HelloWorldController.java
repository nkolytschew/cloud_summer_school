package com.github.nkolytschew.cloudsummerschool.mvc.web;


import org.springframework.web.bind.annotation.*;


/**
 * {@link RestController} combines {@link org.springframework.stereotype.Controller} annotation and {@link ResponseBody} anotation
 */
//@Controller
@RestController
public class HelloWorldController {

    int counter = 0;

    /**
     * instead of {@link RequestMapping} you can use {@link GetMapping}
     * use {@link ResponseBody} if you have {@link org.springframework.stereotype.Controller} annotation and want to return an object instead of a view
     */
    @RequestMapping("/")
    // @GetMapping("/")
    // @ResponseBody
    public String getHello() {
        return String.format("%d hello world!", counter++);
    }

    // @PostMapping("reset")
    @RequestMapping(value = "reset", method = RequestMethod.POST)
    public String postResetHello() {
        this.counter = 0;
        return String.format("%d hello world!", counter);
    }

    // @PostMapping("set/{number}")
    @RequestMapping(value = "set/{number}", method = RequestMethod.POST)
    public String postNumber(@PathVariable int number) {
        this.counter = number;
        return String.format("%d hello world!", counter);
    }
}
