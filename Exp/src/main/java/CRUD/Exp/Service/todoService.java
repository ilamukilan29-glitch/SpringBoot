package CRUD.Exp.Service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import CRUD.Exp.Models.todo;
import CRUD.Exp.Repositories.todoRepository;

@Service 
public class todoService {
    
    @Autowired 
    private todoRepository todorepo;

    public todo createTodo(todo data){
        return todorepo.save(data);
    }

    public todo getTodo(Long id){
        // -- use findById() for finding the data else throw the exceptions using orElseThrow with new RuntimeException() --
        return todorepo.findById(id).orElseThrow(()->new RuntimeException("Todo Not Found"));
    }
    public List<todo> getTodos(){
        return todorepo.findAll();
    }
    public todo UpdateTodo(todo data){
        return todorepo.save(data);
    }
    public Page<todo> getTodosByPage(int page,int size){
        Pageable pageable = PageRequest.of(page, size);
        return todorepo.findAll(pageable);
    }
    public void deleteTodo(Long id){
        todorepo.delete(getTodo(id));
    }
}
