package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/health")
    public String index() {
        return "Greetings from Spring Boot!<br/>" +
                "1. /arraydemo<br/>"+
                "2. /BiggestSmallest<br/>"+
                "3./FrontBack<br/>"+
                "4./SeperatingArray<br/>"+
                "5./IntegerInputs<br/>";

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
    @RequestMapping("/FrontBack")
    public String FrontBack() {
        FrontBack frontBack = new FrontBack();
        return "Front Back Array list:" +frontBack.isSymmetric();
    }
    @RequestMapping("/SeperatingArray")
    public String  SeperatingArray() {
        SeperatingArray seperatingArray = new SeperatingArray();
        return "Output Array1=" + seperatingArray.seperate1() + "Output Array2=" + seperatingArray.seperate2();
    }
    @RequestMapping("/IntegerInputs")
    public String  IntegerInputs() {
        IntegerInputs integerInputs = new IntegerInputs();
        return "maximum value =" + integerInputs.getMaximum() + "minimum value =" + integerInputs.getMinimum();
    }




    }
