package SpringDi;

import org.springframework.stereotype.Service;

@Service // musi byc @Service bo inaczej nie zadziala @Autowired
public class Calc {
    int add(int a, int b){
        return a+b;
    }
}
