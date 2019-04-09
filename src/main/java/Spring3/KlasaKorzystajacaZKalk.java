package Spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KlasaKorzystajacaZKalk {

    @Autowired
    private Kalk kalk;

    public String  show() {
        return
                ("Klasa korzystajaca z klasy Kalk zeby zademonstrowac Dependency Injection "
                        + kalk.add(2, 3)); // bez autowired po wejsciu na strone wyrzuca NullPointerException: null
    }

    @GetMapping
    public String returnS() {
        return show();
    }

}
