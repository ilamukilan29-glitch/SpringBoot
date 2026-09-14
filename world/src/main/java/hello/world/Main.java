package hello.world;

import hello.world.Service.TodoService;

public class Main {
    public static void main(String[] args) {
        TodoService todoService = new TodoService();
        todoService.printTodo();
    }
}
