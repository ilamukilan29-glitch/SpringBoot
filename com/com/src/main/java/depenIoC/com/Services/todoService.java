package depenIoC.com.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import depenIoC.com.Repositories.todoRepository;

@Service 
public class todoService{ 
    
    @Autowired 
    private todoRepository todorepo;
    public void printalltodo(){
        System.out.println(todorepo.getalltodo());
    }
}
