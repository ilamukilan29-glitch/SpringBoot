package mukill.maven.index.controlers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/users")
public class userController {

    @GetMapping
    public String getUsers(){
        return "Hello Mukill !!";
    }
}
