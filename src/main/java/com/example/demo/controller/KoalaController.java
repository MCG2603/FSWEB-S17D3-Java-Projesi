package com.example.demo.controller;
import com.example.demo.entity.Koala;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class KoalaController {

    private Map<Integer, Koala> koalas;

    @RequestMapping( "/hello" )
    public String echo() {
        return "Hello World!";
    }
    @PostConstruct
    public void init(){

        koalas=new HashMap<>();


    }
    @GetMapping("/")
    public List<Koala> Get(){

        return koalas.values().stream().toList();

    }

    @PostMapping("/")
    public Koala post(@RequestBody Koala kola){
        if(kola.getId() <0 || koalas.containsKey(kola.getId())){
            return null;
        }
        koalas.put(kola.getId(), kola);
        return kola;
    }
    @DeleteMapping("/{id}")
    public Koala delete(@PathVariable int id){

        if(id<0 || !koalas.containsKey(id)){
            return null;
        }
        return koalas.remove(id);
    }
}
