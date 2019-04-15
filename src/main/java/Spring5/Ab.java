package Spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ab {

    public List fizzBuzz(){
        List<String > list = new ArrayList<>();
        String text = "";
        for (int i = 1; i < 101; i++) {

            if (i%3==0 && i%5==0) {
                text = "FizzBuzz";
            }
            else if (i%3==0){
                text = "Fizz";
            }
            else if (i%5==0){
                text = "Buzz";
            }
            else{
                text=  String.valueOf(i);
            }
            list.add(text);
        }
        return list;
    }

    public static void main(String[] args) {
        Ab ab = new Ab();
        System.out.println(ab.fizzBuzz());

        SpringApplication.run(Ab.class, args);
    }
}
