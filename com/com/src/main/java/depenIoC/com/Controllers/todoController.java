package depenIoC.com.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import depenIoC.com.Services.todoService;

@RestController 
@RequestMapping("/api")
public class todoController {

    // main thing for IoC to give Invert the control of creating object to Spring
    @Autowired 
    private todoService todoService;

    @GetMapping ("/user")
    String printtodo(){
        todoService.printalltodo();
        return "hello...";
    }
}
