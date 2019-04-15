package Spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kontroller {

    @Autowired
    Kalk kalk;



    @GetMapping
    public String greetings(){
        return kalk.show();
    }
}
