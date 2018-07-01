package hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/health")
    public String index() {
        return "Greetings from Spring Boot!<br/>" +
                "1. /arraydemo<br/>" +
                "2. /BiggestSmallest<br/>" +
                "3./FrontBack<br/>" +
                "4./SeperatingArray<br/>" +
                "5./IntegerInputs<br/>";

    }

    @RequestMapping("/arraydemo")
    public String arrayDemo() {
        return "This is the output of array demo.";
    }

    @RequestMapping("/BiggestSmallest")
    public String getBiggestSmallest() {
        LargestSmallest largestSmallest = new LargestSmallest();
        return "the bigest value is :" + largestSmallest.getBiggest() +
                "<br/>the smallest value is :" + largestSmallest.getsmallest();
    }

    @RequestMapping("/FrontBack")
    public String FrontBack() {
        FrontBack frontBack = new FrontBack();
        return "Front Back Array list:" + frontBack.isSymmetric();
    }

    @RequestMapping("/SeperatingArray")
    public String SeperatingArray() {
        SeperatingArray seperatingArray = new SeperatingArray();
        return "Output Array1=" + seperatingArray.seperate1() + "Output Array2=" + seperatingArray.seperate2();
    }

    @PostMapping("/IntegerInputs")
    public @ResponseBody  Output IntegerInputs(@RequestBody Input input) {
        IntegerInputs integerInputs = new IntegerInputs();

        Output output = new Output();
        output.result = "maximum value =" + integerInputs.getMaximum(input) + "minimum value =" + integerInputs.getMinimum(input);

        return output;
    }

}
