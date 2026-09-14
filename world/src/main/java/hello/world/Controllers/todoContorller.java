package hello.world.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Which controls all the rest methods like get put delete,etc
@RestController

//Reduce the Repetaition of similar pervious endpoint
@RequestMapping("/todo")
public class todoContorller {
    // 
    @GetMapping("/run")
    String getTodo(){
        return "Todo Is Running";
    }

    @GetMapping("/create")
    String createtodo(){
        return "Todo Created";
    }

    // Path Variables
    @GetMapping("/{id}")
    String todoid(@PathVariable int id){
        return "Todo with "+id;
    }

    //Request Params
    @GetMapping("")
    String todoreq(@RequestParam("todoid") int id){
        return "Requested "+id;
    }

    //Request Body
    @PostMapping("/created")
    String createIser(@RequestBody String val){
        return val;
    }
    // Put Mapping
    @PutMapping("/{id}")
    String gettodoupdate(@PathVariable int id){
        return "Todo Updated "+id;
    }
    // Delete request
    @DeleteMapping("/{id}")
    String dodelete(@PathVariable int id){
        return "Todo Deleted "+id;
    }
}
