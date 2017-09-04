package com.github.nkolytschew.cloudsummerschool.mvc.web;


import org.springframework.web.bind.annotation.*;


//@Controller
@RestController
public class HelloWorldController {

    int counter = 0;

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
