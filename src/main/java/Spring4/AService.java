package Spring4;

import org.springframework.stereotype.Component;

@Component
public class AService {
    String show(){
        return "Hello";
    }
    int returnPI(){
        return 3;
    }
}
