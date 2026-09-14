package hello.world.Service;

import org.springframework.stereotype.Service;

import hello.world.Repositories.TodoRepository;

//Bean -- its a java object created and managed by spring
@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(){
        todoRepository = new TodoRepository();
    }
 
    public void printTodo(){
        System.out.println(todoRepository.getAllTodos());
    }
}
