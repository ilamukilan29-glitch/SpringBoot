package mukill.maven.index;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping("/")
    public String wishes() {
        return "Hello World";
    }
}