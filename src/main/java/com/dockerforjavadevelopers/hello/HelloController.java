package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.UUID;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello World\n";

    }
    @RequestMapping("/healthz")
    public boolean healthz() {
        return true;
    }
    @RequestMapping("/logs")
    public void logs(){
        System.out.println(UUID.randomUUID.toString()+" godzadro3");
    }
}
