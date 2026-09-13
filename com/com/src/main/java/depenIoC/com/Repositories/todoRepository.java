package depenIoC.com.Repositories;

import org.springframework.stereotype.Component;

@Component 
public class todoRepository {
    
    public String getalltodo(){
        return "Hello All the ToDos Returned";
    }
}
