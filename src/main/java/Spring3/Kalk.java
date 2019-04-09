package Spring3;

import org.springframework.stereotype.Component;

@Component
public class Kalk {
    int add(int a, int b) {
        return a + b;
    }

    int multiple(int a, int b){
        return a*b;
    }

}
