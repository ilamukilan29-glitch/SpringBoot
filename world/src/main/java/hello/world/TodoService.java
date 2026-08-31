package hello.world;

import org.springframework.stereotype.Service;

//Bean -- its a java object created and managed by spring
@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(){
        todoRepository = new TodoRepository();
    }

    public void getTodo(){
        System.out.println(todoRepository.getAllTodos());
    }
}
