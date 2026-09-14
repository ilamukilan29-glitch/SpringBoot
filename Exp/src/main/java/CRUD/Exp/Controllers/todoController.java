package CRUD.Exp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import CRUD.Exp.Models.todo;
import CRUD.Exp.Service.todoService;

@RestController 
public class todoController {
    
    @Autowired 
    private todoService todoservice;

    @PostMapping("/create")
    //  ResponseEntity<todo> -- for returning as HTTP Response 
    ResponseEntity<todo> createtodo(@RequestBody todo data){
        return new ResponseEntity<>(todoservice.createTodo(data),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    ResponseEntity<todo> gettodo(@PathVariable  Long id){
        try{
            todo gettedtodo = todoservice.getTodo(id);
        return new ResponseEntity<>(gettedtodo,HttpStatus.OK);
        }
        catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }  
    @GetMapping("/all")
    ResponseEntity<List<todo>> gettodos(){
        try{
            List<todo> list = todoservice.getTodos();
             return new ResponseEntity<>(list,HttpStatus.OK);
        }catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @PutMapping("/update")
    ResponseEntity<todo> Updatetodo(@RequestBody todo value){
        return new ResponseEntity<>(todoservice.UpdateTodo(value),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/{id}")
    void Updatetodo(@PathVariable Long id){
        todoservice.deleteTodo(id);
    }

}
