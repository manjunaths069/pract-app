package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/health")
    public String index() {
        return "Greetings from Spring Boot!<br/>" +
                "1. /arraydemo";
    }

    @RequestMapping("/arraydemo")
    public String arrayDemo() {
        return "This is the output of array demo.";
    }

}
