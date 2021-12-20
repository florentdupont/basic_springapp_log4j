package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.util.ArrayList;

@RestController
@Slf4j
public class MyController {
    
    @GetMapping("/")
    public String test(@RequestParam("name") String name) {
        // exemple de lookup : s'il arrive a trouver, alors il remplace le texte
//        log.info("${java:runtime}" );
//        log.info("${java:os}" );

        
        log.info("logging : " + name);
      
         return "OK";
    }
    
  
}
