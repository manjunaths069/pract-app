package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/health")
    public String index() {
        return "Greetings from Spring Boot!<br/>" +
                "1. /arraydemo<br/>"+
                "2. /BiggestSmallest";

    }

    @RequestMapping("/arraydemo")
    public String arrayDemo() {
        return "This is the output of array demo.";
    }
    @RequestMapping("/BiggestSmallest")
    public String getBiggestSmallest() {
        LargestSmallest largestSmallest = new LargestSmallest();
        return "the bigest value is :"+largestSmallest.getBiggest()+
                "<br/>the smallest value is :"+largestSmallest.getsmallest();
    }

}
