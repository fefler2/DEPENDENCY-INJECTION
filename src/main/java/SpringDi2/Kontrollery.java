package SpringDi2;

import SpringDi2.kalk.Kalkulator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kontrollery {
    @GetMapping
    public String greet(){
        return "Hello";
    }
//    @Autowired
    Kalkulator kalkulator;

    @GetMapping("/a")
    public String getA(){
        int c = kalkulator.add(2,3);
        return "A";
    }
}
