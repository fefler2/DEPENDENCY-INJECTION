package Spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @Autowired
    AService aService;

    @GetMapping("/b")
    public String getS(){
        return "a";
    }

    @GetMapping()
    public String getS2(){
        return aService.show();
    }
}
