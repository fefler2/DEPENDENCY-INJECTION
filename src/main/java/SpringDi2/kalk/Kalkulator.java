package SpringDi2.kalk;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class Kalkulator {

    public int add(int a, int b){
        return a+b;
    }int subtract(int a, int b){
        return a-b;
    }


}
